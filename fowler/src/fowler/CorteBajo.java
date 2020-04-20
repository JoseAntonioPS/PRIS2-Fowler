package fowler;

class CorteBajo extends Prendas{

	public CorteBajo(String nombre, int cantidad, Pasarelas pasarela) {
		super(nombre, cantidad, pasarela);
	this.nombre = "CB-" + nombre;
		}
}
