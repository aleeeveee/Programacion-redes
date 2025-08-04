
public class planesdepago {
	 public static void main(String[] args) {
	        // Pedir el precio del artículo
	        System.out.print("Ingrese el precio del artículo: ");
	        
	        // Leer el precio
	        int precio = leerEntero();
	        
	        // Calcular y mostrar los valores a pagar según cada plan
	        calcularPlan1(precio);
	        calcularPlan2(precio);
	        calcularPlan3(precio);
	        calcularPlan4(precio);
	    }

	    // Método para calcular el Plan 1
	    public static void calcularPlan1(int precio) {
	        double precioConDescuento = precio - (precio * 0.10);  // 10% de descuento
	        System.out.println("Plan 1: Precio al contado con 10% de descuento: " + precioConDescuento);
	    }

	    // Método para calcular el Plan 2
	    public static void calcularPlan2(int precio) {
	        double precioIncrementado = precio + (precio * 0.10);  // 10% de incremento
	        double contado = precioIncrementado * 0.50;  // 50% al contado
	        double cuota = (precioIncrementado * 0.50) / 2;  // El resto en 2 cuotas iguales
	        System.out.println("Plan 2: 50% al contado y el resto en 2 cuotas. Precio total: " + precioIncrementado);
	        System.out.println("    Contado: " + contado + ", 2 cuotas de: " + cuota);
	    }

	    // Método para calcular el Plan 3
	    public static void calcularPlan3(int precio) {
	        double precioIncrementado = precio + (precio * 0.15);  // 15% de incremento
	        double contado = precioIncrementado * 0.25;  // 25% al contado
	        double cuota = (precioIncrementado * 0.75) / 5;  // El resto en 5 cuotas iguales
	        System.out.println("Plan 3: 25% al contado y el resto en 5 cuotas. Precio total: " + precioIncrementado);
	        System.out.println("    Contado: " + contado + ", 5 cuotas de: " + cuota);
	    }

	    // Método para calcular el Plan 4
	    public static void calcularPlan4(int precio) {
	        double precioIncrementado = precio + (precio * 0.25);  // 25% de incremento
	        double primeraParte = (precioIncrementado * 0.60) / 4;  // 60% repartido en 4 cuotas
	        double segundaParte = (precioIncrementado * 0.40) / 4;  // 40% repartido en las otras 4 cuotas
	        System.out.println("Plan 4: Totalmente financiado en 8 cuotas. Precio total: " + precioIncrementado);
	        System.out.println("    Primeras 4 cuotas de: " + primeraParte + ", Últimas 4 cuotas de: " + segundaParte);
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



