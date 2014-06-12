package logica;

import java.util.ArrayList;

public class Genero {
	private Autor autor;
	private Cancion cancion;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public ArrayList<String> getListaAutores() {
		return listaAutores;
	}

	public void setListaAutores(ArrayList<String> listaAutores) {
		this.listaAutores = listaAutores;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}
	
	
}
