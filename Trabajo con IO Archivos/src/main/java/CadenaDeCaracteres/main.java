package CadenaDeCaracteres;

public class main {

	public static void main(String[] args) {
		String palabra = "linKevin";
		
		palabra.charAt(0); // Agarra un caracter x
		palabra.compareTo("Kevin"); // False compara texto completo
		palabra.compareToIgnoreCase("linKevin"); //true
		palabra.concat("/profile");
		palabra.contains("Ke"); // Devuelve si existe el texto
		palabra.indexOf( "n/"); // Lo mismo que charAt pero busca un caracter
		
	}

}