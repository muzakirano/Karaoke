package presentacion;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

import persistencia.ArchivoPlano;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	private PanelReproduccion panelReproduccion;
	private ArchivoPlano archivoPlano;
	
	public VentanaPrincipal() {
		
					archivoPlano = new ArchivoPlano(); 
			try {
				archivoPlano.leerArchivoPlano();
			} catch (IOException e) {
				e.printStackTrace();
			}
			setSize(600, 400);
			getContentPane().setBackground(Color.white);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);

			panelReproduccion = new PanelReproduccion(archivoPlano.getCancion());
			panelReproduccion.setBounds(20, 10, 100, 50); 

			add(panelReproduccion);

			setVisible(true);
	}

	
	public static void main(String[] args) {
		VentanaPrincipal vp = new VentanaPrincipal();
	}
}
