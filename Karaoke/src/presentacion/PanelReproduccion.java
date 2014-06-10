package presentacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import logica.Cancion;
import persistencia.ArchivoPlano;

public class PanelReproduccion extends JPanel{
	
	
	private JTextArea txLetra;
	private Cancion cancion;
		
	public PanelReproduccion(Cancion cancion) {
		
		this.cancion = cancion;
		
		txLetra = new JTextArea();
		txLetra.setBackground(Color.white);
		txLetra.setFont(new Font("Arial", Font.BOLD, 23));
		
		for (int i = 0; i < cancion.getLetra().size(); i++) {
			txLetra.setText(cancion.getLetra().get(i));
			
		}
		add(txLetra);
		
	
	}

}
