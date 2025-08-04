
public class cuadrado {

	public static void main(String[] args) {
		/* Pedir el área del cuadrado*/
        System.out.print("Ingrese el área del cuadrado en m2: ");
        
        // Leer el área (usando System.in.read para leer el valor como entero)
        int area = leerEntero();
        
        // Calcular el lado del cuadrado (raíz cuadrada del área)
        double lado = Math.sqrt(area);

        // Calcular el perímetro del cuadrado
        double perimetro = 4 * lado;

        // Mostrar el perímetro
        System.out.println("El perímetro del cuadrado es: " + perimetro + " metros.");
    }

    // Método para leer un número entero
    public static int leerEntero() {
        int numero = 0;
        int caracter;
        
        try {
            while ((caracter = System.in.read()) != '\n') {  // Leer hasta un salto de línea
                if (caracter >= '0' && caracter <= '9') {  // Si el caracter es un dígito
                    numero = numero * 10 + (caracter - '0');  // Construir el número
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer los datos.");
        }
        return numero;  // Devolver el número leído
    }



	}


