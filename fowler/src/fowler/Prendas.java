package fowler;

abstract class Prendas {

	protected String nombre;
	private int cantidad;
	private Pasarelas pasarela;

	public Prendas (String nombre, int cantidad, Pasarelas pasarela){
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.pasarela = pasarela;
	}

	public String getNombre(){
		return nombre;
	}
	public int getCantidad(){
		return cantidad;
	}
	public Pasarelas getPasarela(){
		return pasarela;
	}

	public void repartoSala(){
			if (getPasarela().getSala() < 10){
				getPasarela().sumSala(2);
			}else if(getPasarela().getSala() < 5){
				getPasarela().sumSala(1);
			}else{
				getPasarela().sumSala(3);
			}
	}


}

