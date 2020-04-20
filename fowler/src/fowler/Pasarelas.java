package fowler;

public class Pasarelas {

	private int numSala = 0;

	public Pasarelas(int sala){
		this.numSala = sala;
	}
	public int getSala(){
		return numSala;
	}
	public void sumSala(int num){
		this.numSala += num;
		}

}