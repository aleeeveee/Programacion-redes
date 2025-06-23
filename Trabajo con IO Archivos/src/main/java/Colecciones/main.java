package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class main {
	public static void main(String[] args) {
		int[] vector = new int[5];

		ArrayList<String> nombres = new ArrayList<>();
		ArrayList comidas = new ArrayList<>();
		
		List<Integer> numeros = new ArrayList<>();
		
		LinkedList<Integer> otraLista = new LinkedList<>();
		List<String> productos = new ArrayList<>();
		
		nombres.add("");
		nombres.addAll(comidas);
		nombres.clear();
		nombres.clone();
		nombres.contains("Juan");
		nombres.containsAll(comidas);
		nombres.get(2); // Obtiene el segundo de la coleccion.
		nombres.indexOf("Juan"); // Busca a "x" en la coleccion.
		nombres.isEmpty();
		nombres.remove(0);
		nombres.remove("Juan");
		nombres.removeAll(productos);
		nombres.size();
		nombres.set(4, "Pedro");
		nombres.sort(null);
		nombres.subList(0, 0);
		nombres.toArray();
		
		//hash
		HashMap<Integer, String> diccionario = new HashMap<>();
		LinkedHashMap<CadenaDeCaracteres.main, String> diccEnlace = new LinkedHashMap<>();
		
		diccionario.containsKey( 5 );
		diccionario.get( 2 );
		diccionario.put(4, "hola");
		diccionario.remove(5);
		diccionario.remove(4, "hola");	
		diccionario.entrySet();
		
		HashSet<Integer> DNI = new HashSet<>();
		LinkedHashSet<Integer> CUIL = new LinkedHashSet<>();
		Set<Integer> dni = new HashSet<>();
		
		}
	public static void recorrido()
	{
		ArrayList<String> nombres = new ArrayList<>();
		for(int i=0;i<=nombres.size();i++)
		{
			nombres.get(i);
		}
		for( String item : nombres )
		{
			System.out.println( item );
		}
		
		Iterator it = nombres.iterator();
		while( it.hasNext() )
		{
			System.out.println( it.next() );
		}
	}
} 
