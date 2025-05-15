package punto2;

import java.io.*;

public class ordenarapellidos {

    public static void main(String[] args) throws IOException {
        // Crear un objeto para leer la entrada
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // Leer tres apellidos
        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = br.readLine();
        
        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = br.readLine();
        
        System.out.print("Ingrese el tercer apellido: ");
        String apellido3 = br.readLine();
        
        // Crear un arreglo con los apellidos
        String[] apellidos = {apellido1, apellido2, apellido3};
        
        // Ordenar los apellidos alfabéticamente
        if (apellidos[0].compareTo(apellidos[1]) > 0) {
            String temp = apellidos[0];
            apellidos[0] = apellidos[1];
            apellidos[1] = temp;
        }
        
        if (apellidos[1].compareTo(apellidos[2]) > 0) {
            String temp = apellidos[1];
            apellidos[1] = apellidos[2];
            apellidos[2] = temp;
        }
        
        if (apellidos[0].compareTo(apellidos[1]) > 0) {
            String temp = apellidos[0];
            apellidos[0] = apellidos[1];
            apellidos[1] = temp;
        }
        
        // Mostrar los apellidos ordenados
        System.out.println("Los apellidos ordenados alfabéticamente son:");
        System.out.println(apellidos[0]);
        System.out.println(apellidos[1]);
        System.out.println(apellidos[2]);
    }
}
