package presentacion;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import logica.Cancion;

public class PanelArtistas extends JPanel{

	private ArrayList<Cancion> listaAutores;
	private DefaultListModel<String> modeloAutores;
	private JList<String> jListaAutores;
	
	public PanelArtistas() {
		
		listaAutores = new ArrayList<>();
		modeloAutores = new DefaultListModel<>();
		jListaAutores = new JList<>(modeloAutores);
		add(jListaAutores);
		
		
	}
	
}
