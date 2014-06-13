package presentacion;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import logica.Cancion;

public class PanelCanciones extends JPanel{
	
	private ArrayList<Cancion> listaCanciones;
	private DefaultListModel<String> modeloCanciones;
	private JList<String> jListaCanciones;
	
	
	public PanelCanciones() {
		
		listaCanciones = new ArrayList<>();
		modeloCanciones = new DefaultListModel<>();
		jListaCanciones = new JList<>(modeloCanciones);
		add(jListaCanciones);
		
		
	}

}
