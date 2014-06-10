package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import logica.Cancion;

public class ArchivoPlano {

	
	private File file;
	private BufferedReader bufferedReader;
	private String linea;
	private Cancion cancion;
	
	public ArchivoPlano() {

		cancion = new Cancion();
		linea = "";
	}
	
	public void leerArchivoPlano() throws IOException {
		JFileChooser jf = new JFileChooser("src/files");
		int opcion = jf.showOpenDialog(null);	
		if (opcion == JFileChooser.APPROVE_OPTION) {
			file = new File(jf.getSelectedFile().getPath());
		}
		FileReader fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		while(bufferedReader.ready()){
			linea = bufferedReader.readLine();
			cancion.agregarLinea(linea);
			System.out.println(cancion.getLetra().get(0));
			
		}
	}
	
	
	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	
	public static void main(String[] args) {
	
		ArchivoPlano ap = new ArchivoPlano();
	}
}
