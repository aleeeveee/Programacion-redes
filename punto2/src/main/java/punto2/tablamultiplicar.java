package punto2;
	import java.io.*;

	public class tablamultiplicar {

	    public static void main(String[] args) throws IOException {
	        // Crear un objeto BufferedReader para leer el número
	        InputStreamReader reader = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(reader);
	        
	        // Leer el número N (entero natural)
	        System.out.print("Ingrese un número natural (N): ");
	        int N = Integer.parseInt(br.readLine()); // Leer el número
	        
	        // Mostrar la tabla de multiplicar de N
	        System.out.println("Tabla de multiplicar de " + N + ":");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = N * i;  // Calcular el resultado de la multiplicación
	            System.out.println(N + " x " + i + " = " + resultado);  // Imprimir el resultado
	        }
	    }
	}
