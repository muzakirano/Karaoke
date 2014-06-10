package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ArchivoPlano {
	
	private File file;
	private BufferedReader bufferedReader;
	private String linea;
	
	public ArchivoPlano() {

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
			
		}
	}
}
