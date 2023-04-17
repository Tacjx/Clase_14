package ar.edu.utn.ap40;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern ;

public class Main {

	public static void main(String[] args) {
		
		String archivo=new File("C:\\Users\\Usuario\\Desktop\\Git\\archivoClase14.txt").getAbsolutePath();
		
		int i=1;
		
		try {
			for(String linea: Files.readAllLines(Paths.get(archivo))){
				
				if (linea.matches("[a-z]{7}")==true){
					System.out.println("Linea "+i);
					System.out.println("Si corresponde");
					System.out.println("");
					
					
				}else {
					System.out.println("Linea "+i);
					System.out.println("No corresponde");
					System.out.println("");
					
				}
				
				
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
