package presentacion;

import javax.swing.JFrame;

import persistencia.ArchivoPlano;

public class VentanaPrincipal extends JFrame{

	private PanelReproduccion panelReproduccion;
	private ArchivoPlano archivoPlano;
	
	public VentanaPrincipal() {
		
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelReproduccion = new PanelReproduccion(archivoPlano.getCancion());
		panelReproduccion.setBounds(20, 350, 390, 50);
		
		add(panelReproduccion);
	}
	
}
