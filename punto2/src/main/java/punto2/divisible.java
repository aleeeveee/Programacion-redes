package punto2;
import java.io.*;

public class divisible {

    public static void main(String[] args) throws IOException {
        // Crear un objeto InputStreamReader y BufferedReader
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // Leer el primer número real
        System.out.print("Ingrese el primer número real: ");
        double num1 = leerNumero(br);  // Leer el primer número
        
        // Leer el segundo número real
        System.out.print("Ingrese el segundo número real: ");
        double num2 = leerNumero(br);  // Leer el segundo número

        // Determinar cuál es el mayor y cuál es el menor
        double mayor = num1;
        double menor = num2;

        if (num2 > num1) {
            mayor = num2;
            menor = num1;
        }

        // Comprobar si el mayor es divisible por el menor
        if (menor != 0 && mayor % menor == 0) {
            System.out.println("El número " + mayor + " es divisible por el número " + menor);
        } else {
            System.out.println("El número " + mayor + " NO es divisible por el número " + menor);
        }
    }

    // Método para leer un número real usando BufferedReader y solo los métodos de Reader
    public static double leerNumero(BufferedReader br) throws IOException {
        String input = br.readLine();  // Leer la línea de texto
        return Double.parseDouble(input);  // Convertir la cadena a un número real (double)
    }
}
