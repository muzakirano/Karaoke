package logica;

import java.util.ArrayList;

public class Karaoke extends Thread{
	
	private Cancion cancionActual;
	private Cancion cancion;
	private Autor autor;
	private Genero genero;
	private boolean ejecucion;
	private boolean pausa;
	private ArrayList<String>listaGeneros= new ArrayList<String>();
	
	public Karaoke() {

	}
			
	public void iniciar(){
		ejecucion= true;
		start();		
	}
	
	public void detener() {
		ejecucion= false;
	}
	
	public void pausar(){
		pausa=true;
	}
	
	public void reanudar(){
		pausa=false;
	}
	
	@Override
	public void run() {
		
		while(ejecucion){
			
			while(pausa){
				System.out.println("nada");
			}
		}
	}

	public Cancion getCancionActual() {
		return cancionActual;
	}

	public void setCancionActual(Cancion cancionActual) {
		this.cancionActual = cancionActual;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public boolean isEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(boolean ejecucion) {
		this.ejecucion = ejecucion;
	}

	public boolean isPausa() {
		return pausa;
	}

	public void setPausa(boolean pausa) {
		this.pausa = pausa;
	}

	public ArrayList<String> getListaGeneros() {
		return listaGeneros;
	}

	public void setListaGeneros(ArrayList<String> listaGeneros) {
		this.listaGeneros = listaGeneros;
	}
	
	
}
