
public class signozodiacal {

	public static void main(String[] args) {
		 // Mostrar mensaje de entrada
        System.out.print("Ingrese su signo zodiacal: ");
        
        // Leer el signo zodiacal
        String signo = leerCadena();
        
        // Mostrar el mes de nacimiento aproximado
        mostrarMesDeNacimiento(signo.toLowerCase());
    }

    // Método para mostrar el mes de nacimiento
    public static void mostrarMesDeNacimiento(String signo) {
        switch (signo) {
            case "aries":
                System.out.println("Mes de nacimiento aproximado: Marzo - Abril");
                break;
            case "tauro":
                System.out.println("Mes de nacimiento aproximado: Abril - Mayo");
                break;
            case "geminis":
                System.out.println("Mes de nacimiento aproximado: Mayo - Junio");
                break;
            case "cancer":
                System.out.println("Mes de nacimiento aproximado: Junio - Julio");
                break;
            case "leo":
                System.out.println("Mes de nacimiento aproximado: Julio - Agosto");
                break;
            case "virgo":
                System.out.println("Mes de nacimiento aproximado: Agosto - Septiembre");
                break;
            case "libra":
                System.out.println("Mes de nacimiento aproximado: Septiembre - Octubre");
                break;
            case "escorpio":
                System.out.println("Mes de nacimiento aproximado: Octubre - Noviembre");
                break;
            case "sagitario":
                System.out.println("Mes de nacimiento aproximado: Noviembre - Diciembre");
                break;
            case "capricornio":
                System.out.println("Mes de nacimiento aproximado: Diciembre - Enero");
                break;
            case "acuario":
                System.out.println("Mes de nacimiento aproximado: Enero - Febrero");
                break;
            case "piscis":
                System.out.println("Mes de nacimiento aproximado: Febrero - Marzo");
                break;
            default:
                System.out.println("Signo zodiacal no válido. Intente de nuevo.");
        }
    }

    // Método para leer una cadena de texto
    public static String leerCadena() {
        StringBuilder cadena = new StringBuilder();
        try {
            // Leer hasta encontrar el salto de línea '\n'
            int caracter;
            while ((caracter = System.in.read()) != '\n') {  
                cadena.append((char) caracter);  // Construir la cadena
            }
        } catch (Exception e) {
            // Error simple sin excepciones complejas
            System.out.println("Error al leer los datos.");
        }
        return cadena.toString().trim();  // Devolver la cadena sin espacios extra



	}

}
