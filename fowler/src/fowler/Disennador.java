package fowler;

import java.util.ArrayList;
import java.util.Iterator;

public class Disennador {

	private String nombre;
	private ArrayList<Prendas> prenda = new ArrayList<>();

	public Disennador(String nombre){
		this.nombre = nombre;
	}

	public void addPrendas (Prendas prenda){
		this.prenda.add(prenda);
	}

	public String getNombre(){
		return nombre;
	}

	public String ordenSalas(){
		String cadena;
		Iterator<Prendas> it = prenda.iterator();
		int x = 0;
		cadena = "La sala a la que accederá el diseñador " + getNombre() + "con sus respectivos conjuntos son: " + "/n";

		while (it.hasNext()){
			Prendas cada = prenda.get(x);
			cadena = cada.getNombre() + ", " + cada.getPasarela() + ";";
			x++;

		}
		return cadena;


	}

}