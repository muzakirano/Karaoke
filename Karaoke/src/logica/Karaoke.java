package logica;

import java.util.ArrayList;

public class Karaoke extends Thread{
	
	private Cancion cancionActual;
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
	
	public void colorLetraCancion(){
		
	}
	
}
