
public class triangulo {

	    public static void main(String[] args) {
	        // Crear una instancia de la clase Triangulo
	        triangulo angulo = new triangulo();

	        // Pedir el primer ángulo
	        System.out.print("Ingrese el primer ángulo: ");
	        int primero = angulo.leerEntero();  // Llamamos al método para leer el primer ángulo

	        // Pedir el segundo ángulo
	        System.out.print("Ingrese el segundo ángulo: ");
	        int segundo = angulo.leerEntero();  // Llamamos al método para leer el segundo ángulo

	        // Calcular la suma de los dos ángulos
	        int valor = primero + segundo;

	        // Mostrar la suma de los ángulos
	        System.out.println("La suma de los ángulos es: " + valor);

	        // Calcular el tercer ángulo
	        int tercero = 180 - valor;

	        // Mostrar el tercer ángulo
	        System.out.println("El tercer ángulo es: " + tercero);
	    }

	    // Método para leer un número entero
	    int leerEntero() {
	        int numero = 0;
	        int caracter;

	        // Leer hasta un salto de línea
	        try {
	            while ((caracter = System.in.read()) != '\n') {  // Leer hasta el salto de línea
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


