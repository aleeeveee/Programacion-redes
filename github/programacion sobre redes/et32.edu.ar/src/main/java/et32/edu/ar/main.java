package et32.edu.ar;

import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x = 5;
		
		System.out.println( "Hola mundo" ) ;
		System.out.print( "otro texto" );
		System.out.print( "bla bla bla \n" );
		System.out.println( "Hola mundo" ) ;
		/*   %d  int
		 *   %s  string
		 *   %c  char
		 *   %b  bool
		 *   %f  float
		 *   
		 *   (float)variable   fuerza a una variable a cambiar de tipo (en ese lugar) 
		 */
		System.out.printf( "el valor de la variable x: %.2f y el nombre del usar es: %s \n" , (float)x , "gonza" );

//carga datos en el canal de comunicaciones
		System.out.write( 60 );
		System.out.write( 62 );
		
		//vacia el canal de comunicacione hacia el destino
		System.out.flush();
		
		PrintStream ps = new PrintStream(System.out);//administra los canales de flujo,solo para mandar mensajes 
	   PrintStream err = new PrintStream(System.err );// se mandan los errores internos, se usa para advertencia 
	   err.println("aca esta explotando todo");
		
		 
		

	}

}
