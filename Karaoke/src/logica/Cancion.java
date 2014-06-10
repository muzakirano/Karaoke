package logica;

import java.util.ArrayList;

public class Cancion {
	
	private String nombre;
	private int	duracion;
	private ArrayList<String> letra;
	private int numeroLineaActual;
	private String imagenAlbum;
	

	public Cancion() {

		letra = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public ArrayList<String> getLetra() {
		return letra;
	}


	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}


	public int getNumeroLineaActual() {
		return numeroLineaActual;
	}


	public void setNumeroLineaActual(int numeroLineaActual) {
		this.numeroLineaActual = numeroLineaActual;
	}


	public String getImagenAlbum() {
		return imagenAlbum;
	}


	public void setImagenAlbum(String imagenAlbum) {
		this.imagenAlbum = imagenAlbum;
	}
	
	public void agregarLinea(String linea) {
		
		letra.add(linea);
	}
	
	
}
