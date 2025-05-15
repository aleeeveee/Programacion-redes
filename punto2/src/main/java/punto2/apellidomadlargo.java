package punto2;

import java.io.*;

public class apellidomadlargo {

    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer los datos de entrada
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // Leer los nombres y apellidos de las dos personas
        System.out.print("Ingrese el nombre y apellido de la primera persona: ");
        String persona1 = br.readLine(); // Nombre y apellido de la primera persona
        
        System.out.print("Ingrese el nombre y apellido de la segunda persona: ");
        String persona2 = br.readLine(); // Nombre y apellido de la segunda persona

        // Extraer los apellidos de las personas
        String apellido1 = persona1.split(" ")[1]; // Suponemos que el apellido está al final
        String apellido2 = persona2.split(" ")[1]; // Suponemos que el apellido está al final

        // Comparar la longitud de los apellidos
        if (apellido1.length() > apellido2.length()) {
            System.out.println("La primera persona tiene el apellido más largo: " + apellido1);
        } else if (apellido1.length() < apellido2.length()) {
            System.out.println("La segunda persona tiene el apellido más largo: " + apellido2);
        } else {
            System.out.println("Ambos tienen el mismo largo de apellido.");
        }
    }
}

