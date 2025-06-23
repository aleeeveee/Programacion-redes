package introduccionJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		/*
		System.out.print(""); //Manda el dato sin salto de linea
		System.out.println(""); //Manda un salto de linea
		System.out.write(); //Byte
		System.out.printf("texto", var , var2 , var3); // Concatenar datos
		System.err;
		System.in;
		*/
		PrintStream ps = new PrintStream(System.out);
		PrintStream psErr = new PrintStream(System.err);
		
		ps.println("Hola Gonzalito");
		int linea;
		String palabra;
		palabra = "gonza" ;
		try{
			while((linea = System.in.read()) != 13){
				ps.print((char)linea);
			}
		}catch(IOException e){
			e.printStackTrace();
			}
		psErr.println("Me duermooooo");
		ps.printf("La variable palabra: %s /n", palabra);
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader( isr);
		
	}
}

	
