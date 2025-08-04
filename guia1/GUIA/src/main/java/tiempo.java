
public class tiempo {

	public static void main(String[] args) {
		  System.out.print("Ingrese el tiempo en segundos: ");
	        
	        // Leer el tiempo en segundos
	        int segundos = leerEntero();
	        
	        // Calcular días, horas, minutos y segundos
	        int dias = segundos / 86400;  // Dividir los segundos entre 86400 para obtener los días
	        segundos = segundos % 86400;  // Obtener los segundos restantes después de calcular los días
	        
	        int horas = segundos / 3600;  // Dividir los segundos restantes entre 3600 para obtener las horas
	        segundos = segundos % 3600;  // Obtener los segundos restantes después de calcular las horas
	        
	        int minutos = segundos / 60;  // Dividir los segundos restantes entre 60 para obtener los minutos
	        segundos = segundos % 60;    // Obtener los segundos restantes después de calcular los minutos

	        // Mostrar el resultado
	        System.out.println("El tiempo es: " + dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
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
