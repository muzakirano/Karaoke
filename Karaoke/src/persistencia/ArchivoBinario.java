package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import logica.Cancion;

public class ArchivoBinario {
	
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream; 
	private File file;
	private Cancion cancion;
	
	public ArchivoBinario() {

	}
	
	public void guardarLetraCancion(Cancion cancion){
		File file = new File("/.c1.ckm");
		try {
			fileOutputStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			objectOutputStream= new ObjectOutputStream(fileOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			objectOutputStream.writeObject(cancion);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	
	public void leer(){
		File file = new File("/.c1.ckm");
		Cancion c= null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			objectInputStream= new ObjectInputStream(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				//falta el final del metodo return
	}

}
