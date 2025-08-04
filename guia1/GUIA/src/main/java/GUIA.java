import java.io.IOException;
/*EJERCICIO1*/
public class GUIA {

    public static void main(String[] args) {
        GUIA trabajo = new GUIA();

        System.out.print("Valor de la hora: ");
        int valorHora = trabajo.leerEntero();

        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = trabajo.leerEntero();

        int sueldoBruto = valorHora * horasTrabajadas;

        System.out.println("El sueldo bruto es: " + sueldoBruto);
    }

    public int leerEntero() {
        int numero = 0;
        int caracter = 0;

        try {
            while ((caracter = System.in.read()) != '\n') {
                if (caracter >= '0' && caracter <= '9') {
                    numero = numero * 10 + (caracter - '0');
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer la entrada.");
        }

        return numero;
    }
}

