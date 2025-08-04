
public class temperatura {

	public static void main(String[] args) {
		 // Pedir la temperatura en Fahrenheit
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        
        // Leer la temperatura en Fahrenheit (como entero, porque la entrada será un número entero)
        int fahrenheit = leerEntero();
        
        // Convertir a grados Celsius (utilizando 'float' para manejar decimales)
        float celsius = (5.0f / 9.0f) * (fahrenheit - 32);
        
        // Mostrar el resultado
        System.out.println("La temperatura en grados Celsius es: " + celsius + "°C");
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
