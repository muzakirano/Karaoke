package presentacion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import logica.Cancion;

public class PanelReproduccion extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextArea txLetra;
	private Cancion cancion;
		
	public PanelReproduccion(Cancion cancion) {
		
		this.cancion = cancion;
		setBackground(Color.white);
		
		txLetra = new JTextArea();
		txLetra.setFont(new Font("Arial", Font.BOLD, 23));
		txLetra.setEditable(false);
		
		for (int i = 0; i < cancion.getLetra().size(); i++) {
			txLetra.setText(cancion.getLetra().get(i));
			
		}	
		add(txLetra);
	}

}
