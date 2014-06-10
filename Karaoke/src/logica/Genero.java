package logica;

import java.util.ArrayList;

public class Genero {
	String nombre;
	private ArrayList<String>listaAutores= new ArrayList<String>();
	String imagenGenero;
	
	public Genero() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagenGenero() {
		return imagenGenero;
	}

	public void setImagenGenero(String imagenGenero) {
		this.imagenGenero = imagenGenero;
	}
	
	
}
