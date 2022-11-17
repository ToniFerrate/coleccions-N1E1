package coleccionsN1E1;

import java.util.ArrayList;
import java.util.HashSet;

/*
Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). 
Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte 
amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que 
l’ArrayList manté l'ordre correcte.

Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.

Recorre la llista amb un for i amb un iterador
*/

public class App {
	static ArrayList <Month> llistaMesos = new ArrayList <Month>();
	static HashSet<Month> hset = new HashSet<Month>();
	
	public static void main(String[] args) {
		
		llistaMesos.add(new Month("gener"));
		llistaMesos.add(new Month("febrer"));
		llistaMesos.add(new Month("març"));
		llistaMesos.add(new Month("abril"));
		llistaMesos.add(new Month("maig"));
		llistaMesos.add(new Month("juny"));
		llistaMesos.add(new Month("juliol"));
		llistaMesos.add(new Month("setembre"));
		llistaMesos.add(new Month("octubre"));
		llistaMesos.add(new Month("novembre"));
		llistaMesos.add(new Month("desembre"));
		
		llistaMesos.set(7, new Month("Agost"));
		
		// iterador per mostrar tots els mesos (estan ordenats)
		mostraMesos();
		
		// Crea el HashSet a partir de l'ArrayList
		creaHashSet();
		
		// Mostra el HashSet. Es perd l'ordre que tenia l'ArrayList
		mostraHashSet();

	}
	
	// iterant
	static void mostraMesos() {
		for (int i=0; i<llistaMesos.size(); i++) {
			System.out.println(llistaMesos.get(i).getName());
		}
	}
	
	// Crea el HashSet a partir de l'ArrayList
	static void creaHashSet(){
		for (Month mes : llistaMesos) {
			hset.add(mes);
		}
	}
	
	// Mostra el HashSet. Es perd l'ordre que tenia l'ArrayList
	static void mostraHashSet() {
		for (Month mes : hset) {
			System.out.println(mes.getName());
		}
	}
}
