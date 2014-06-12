package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Cancion extends Thread  implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int	duracion;
	private ArrayList<String> letra;
	private int numeroLineaActual;
	private String imagenAlbum;
	private boolean iniciar;
	private boolean parar;


	public Cancion() {

		numeroLineaActual = 0;
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

	public void comenzar() {
		iniciar = true;
		start();
	}

	public void pausar() {
		parar = true;
	}

	@Override
	public void run() {
		super.run();
		while (iniciar) {
			leerLetra();
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(letra.size());
	}

	public void leerLetra() {

		if (numeroLineaActual <= letra.size()) {
			System.out.println(letra.get(numeroLineaActual));
			numeroLineaActual++;	
		}


	}
	public String obtenerDuracion(){//falta probar el metodo en el main O.o
		int minutos = duracion/60;
		int segundos = duracion%60;
		return minutos+":"+segundos;
	}

}
