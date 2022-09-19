package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<>();
		
		minhaLista.add(5);
		minhaLista.add(10);
		minhaLista.add(15);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(50);
		
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\n Removendo um elemento da lista...");
		System.out.println();
		minhaLista.remove(0);
		
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\n Primeiro elemento: " + primeiroElemento);
		System.out.println();
		
		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("\n Elemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("\n Depois de ordenada...");
		System.out.println(minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<>();
		
		meuSet.add(7);
		meuSet.add(9);
		meuSet.add(20);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(34);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while (iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
	}
}
