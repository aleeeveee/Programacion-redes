package punto2;
import java.io.*;

public class signozodiacal {

    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la fecha de nacimiento
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // Leer el mes y el día de nacimiento
        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = Integer.parseInt(br.readLine()); // Leer el mes
        
        System.out.print("Ingrese el día de nacimiento (1-31): ");
        int dia = Integer.parseInt(br.readLine()); // Leer el día
        
        // Determinar el signo zodiacal
        String signo = obtenerSigno(mes, dia);
        
        // Mostrar el signo zodiacal
        System.out.println("Tu signo zodiacal es: " + signo);
    }

    // Método para obtener el signo zodiacal
    public static String obtenerSigno(int mes, int dia) {
        String signo = "";
        
        if (mes == 1) {
            if (dia >= 20) signo = "Acuario";
            else signo = "Capricornio";
        } else if (mes == 2) {
            if (dia >= 19) signo = "Piscis";
            else signo = "Acuario";
        } else if (mes == 3) {
            if (dia >= 21) signo = "Aries";
            else signo = "Piscis";
        } else if (mes == 4) {
            if (dia >= 20) signo = "Tauro";
            else signo = "Aries";
        } else if (mes == 5) {
            if (dia >= 21) signo = "Géminis";
            else signo = "Tauro";
        } else if (mes == 6) {
            if (dia >= 21) signo = "Cáncer";
            else signo = "Géminis";
        } else if (mes == 7) {
            if (dia >= 23) signo = "Leo";
            else signo = "Cáncer";
        } else if (mes == 8) {
            if (dia >= 23) signo = "Virgo";
            else signo = "Leo";
        } else if (mes == 9) {
            if (dia >= 23) signo = "Libra";
            else signo = "Virgo";
        } else if (mes == 10) {
            if (dia >= 23) signo = "Escorpio";
            else signo = "Libra";
        } else if (mes == 11) {
            if (dia >= 22) signo = "Sagitario";
            else signo = "Escorpio";
        } else if (mes == 12) {
            if (dia >= 22) signo = "Capricornio";
            else signo = "Sagitario";
        }
        
        return signo;
    }
}
