package punto2;
import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		
		        // Crear un objeto Scanner para leer la entrada
		        Scanner scanner = new Scanner(System.in);
		        
		        // Leer el número
		        System.out.print("Ingrese un número: ");
		        int numero = scanner.nextInt();  // Lee un número entero
		        
		        // Comprobar si el número es par o impar
		        if (numero % 2 == 0) {
		            System.out.println("El número " + numero + " es par.");
		        } else {
		            System.out.println("El número " + numero + " es impar.");
		        }
		    }
		

	}


