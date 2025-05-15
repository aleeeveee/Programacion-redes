package punto2;

import java.io.*;

public class menornumero {

    public static void main(String[] args) throws IOException {
        // Crear un objeto para leer la entrada
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        // Leer los cuatro números
        System.out.print("Ingrese el primer número: ");
        String input1 = br.readLine();
        double num1 = Double.parseDouble(input1);

        System.out.print("Ingrese el segundo número: ");
        String input2 = br.readLine();
        double num2 = Double.parseDouble(input2);

        System.out.print("Ingrese el tercer número: ");
        String input3 = br.readLine();
        double num3 = Double.parseDouble(input3);

        System.out.print("Ingrese el cuarto número: ");
        String input4 = br.readLine();
        double num4 = Double.parseDouble(input4);

        // Encontrar el menor número
        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        if (num4 < menor) {
            menor = num4;
        }

        // Mostrar el número menor
        System.out.println("El número menor es: " + menor);
    }




	}


