package presentacion;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import logica.Genero;

public class PanelGeneros extends JPanel{
	
	private ArrayList<Genero> listaGeneros;
	private DefaultListModel<String> modeloGeneros;
	private JList<String> jListaGeneros;
	
	public PanelGeneros() {
		
		listaGeneros = new ArrayList<>();
		modeloGeneros = new DefaultListModel<>();
		jListaGeneros = new JList<>(modeloGeneros);
		add(jListaGeneros);
		
		
	}

	public DefaultListModel<String> getModeloGeneros() {
		return modeloGeneros;
	}

	public void setModeloGeneros(DefaultListModel<String> modeloGeneros) {
		this.modeloGeneros = modeloGeneros;
	}
	

}
