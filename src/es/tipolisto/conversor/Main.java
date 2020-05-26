package es.tipolisto.conversor;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	private String nombreFicheroConvertido="sinnombre.bas";
	
	
	public static void main(String[] args) {
		int contadorLinea=Constants.contadorLinea;
		//Creamos la ventana que nos pedrirá el archivo
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		if(args.length>0) {
			System.out.println("Has metido el archivo "+args[0]);
			
			try {
				if(args[1]!=null) {
					System.out.println("El contador de línea empieza en "+args[1]);
					contadorLinea=Integer.parseInt(args[1]);
				}	
				Conversor conversor=new Conversor(args[0], contadorLinea);
				conversor.convertir();
			}catch(Exception ex) {
				System.out.println("Hubo un problema al analizar el contador de línea");
			}
		}
		else {
			System.out.println("No hay datos de entrada para la linea de comandos.");
		}
	}
	
	
	
	
	

}



