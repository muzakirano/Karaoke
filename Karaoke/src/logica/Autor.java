package logica;

import java.util.ArrayList;

public class Autor {
	String nombre;
	private ArrayList<String>listaCanciones= new ArrayList<String>();
	String fotoAutor;
	
	public Autor() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFotoAutor() {
		return fotoAutor;
	}

	public void setFotoAutor(String fotoAutor) {
		this.fotoAutor = fotoAutor;
	}
}
