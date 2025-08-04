package tp2;

import java.io.*;
import java.util.Scanner;

public class inventariobasico {
    static Scanner scanner = new Scanner(System.in);
    static String archivo = "Inventario.dat";

    // Colores ANSI
    static String RESET = "\u001B[0m";
    static String ROJO = "\u001B[31m";
    static String VERDE = "\u001B[32m";
    static String AMARILLO = "\u001B[33m";
    static String AZUL = "\u001B[34m";
    static String CELESTE = "\u001B[36m";

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n" + AZUL + "----- MENÚ -----" + RESET);
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Editar producto");
            System.out.println("5. Salir");
            System.out.print(AMARILLO + "Elija una opción: " + RESET);
            String entrada = leerTexto();
            if (esNumero(entrada).equals("entero")) {
                opcion = convertirAEntero(entrada);
            } else {
                System.out.println(ROJO + "Debe ingresar un número entero." + RESET);
                continue;
            }

            if (opcion == 1) agregarProducto();
            else if (opcion == 2) mostrarProductos();
            else if (opcion == 3) eliminarProducto();
            else if (opcion == 4) editarProducto();
            else if (opcion == 5) System.out.println(VERDE + "Saliendo..." + RESET);
            else System.out.println(ROJO + "Opción inválida." + RESET);
        }
    }

    static String leerTexto() {
        return scanner.nextLine();
    }

    static String esNumero(String texto) {
        try {
            Integer.parseInt(texto);
            return "entero";
        } catch (NumberFormatException e1) {
            try {
                Float.parseFloat(texto);
                return "decimal";
            } catch (NumberFormatException e2) {
                return "no numero";
            }
        }
    }

    static int convertirAEntero(String texto) {
        return Integer.parseInt(texto);
    }

    static float convertirAFloat(String texto) {
        return Float.parseFloat(texto);
    }

    static void agregarProducto() {
        System.out.print("Nombre: ");
        String nombre = leerTexto();

        String precioCompra;
        do {
            System.out.print("Precio de compra: ");
            precioCompra = leerTexto();
        } while (esNumero(precioCompra).equals("no numero"));

        String precioVenta;
        do {
            System.out.print("Precio de venta: ");
            precioVenta = leerTexto();
        } while (esNumero(precioVenta).equals("no numero"));

        String stock;
        do {
            System.out.print("Stock: ");
            stock = leerTexto();
        } while (!esNumero(stock).equals("entero"));

        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(nombre + ";" + precioCompra + ";" + precioVenta + ";" + stock + "\n");
            fw.close();
            System.out.println(VERDE + "Producto guardado." + RESET);
        } catch (IOException e) {
            System.out.println(ROJO + "Error al guardar." + RESET);
        }
    }

    static void mostrarProductos() {
        System.out.println(CELESTE + "\n=== LISTA DE PRODUCTOS ===" + RESET);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            int i = 1;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                System.out.println(AMARILLO + i + ") " + RESET +
                        "Nombre: " + partes[0] +
                        " | Compra: " + partes[1] +
                        " | Venta: " + partes[2] +
                        " | Stock: " + partes[3]);
                i++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println(ROJO + "No se pudo leer el archivo." + RESET);
        }
    }

    static void eliminarProducto() {
        mostrarProductos();
        System.out.print("Número del producto a eliminar: ");
        String entrada = leerTexto();

        if (!esNumero(entrada).equals("entero")) {
            System.out.println(ROJO + "Número inválido." + RESET);
            return;
        }

        int numero = convertirAEntero(entrada);

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            StringBuilder sb = new StringBuilder();
            String linea;
            int i = 1;
            while ((linea = br.readLine()) != null) {
                if (i != numero) {
                    sb.append(linea).append("\n");
                }
                i++;
            }
            br.close();

            FileWriter fw = new FileWriter(archivo);
            fw.write(sb.toString());
            fw.close();
            System.out.println(VERDE + "Producto eliminado." + RESET);
        } catch (IOException e) {
            System.out.println(ROJO + "Error al eliminar." + RESET);
        }
    }

    static void editarProducto() {
        mostrarProductos();
        System.out.print("Número del producto a editar: ");
        String entrada = leerTexto();

        if (!esNumero(entrada).equals("entero")) {
            System.out.println(ROJO + "Número inválido." + RESET);
            return;
        }

        int numero = convertirAEntero(entrada);

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            StringBuilder sb = new StringBuilder();
            String linea;
            int i = 1;
            while ((linea = br.readLine()) != null) {
                if (i == numero) {
                    System.out.println("Ingresá los nuevos datos:");
                    System.out.print("Nuevo nombre: ");
                    String nombre = leerTexto();

                    String precioCompra;
                    do {
                        System.out.print("Nuevo precio de compra: ");
                        precioCompra = leerTexto();
                    } while (esNumero(precioCompra).equals("no numero"));

                    String precioVenta;
                    do {
                        System.out.print("Nuevo precio de venta: ");
                        precioVenta = leerTexto();
                    } while (esNumero(precioVenta).equals("no numero"));

                    String stock;
                    do {
                        System.out.print("Nuevo stock: ");
                        stock = leerTexto();
                    } while (!esNumero(stock).equals("entero"));

                    sb.append(nombre).append(";").append(precioCompra).append(";")
                            .append(precioVenta).append(";").append(stock).append("\n");
                } else {
                    sb.append(linea).append("\n");
                }
                i++;
            }
            br.close();

            FileWriter fw = new FileWriter(archivo);
            fw.write(sb.toString());
            fw.close();
            System.out.println(VERDE + "Producto editado." + RESET);
        } catch (IOException e) {
            System.out.println(ROJO + "Error al editar." + RESET);
        }
    }
}
