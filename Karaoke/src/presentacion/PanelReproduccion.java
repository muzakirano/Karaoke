package presentacion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import logica.Cancion;

public class PanelReproduccion extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	private JTextArea txLetra;
	private Cancion cancion;
	
		
	public PanelReproduccion(Cancion cancion) {
		
		this.cancion = cancion;
		setBackground(Color.white);
		
		txLetra = new JTextArea();
		txLetra.setFont(new Font("Arial", Font.BOLD, 23));
		txLetra.setEditable(false);
		
			
		add(txLetra);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		String letra="";
		for (int i = 0; i < cancion.getLetra().size(); i++) {
			letra=cancion.getLetra().get(i)+"\n"+letra;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			txLetra.setText(letra);
		}
		
		while(true){
			try {
				letra="\n"+letra;
				Thread.sleep(5000);
				txLetra.setText(letra);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
