package ingresso.model;

public class Vip extends Ingresso {
	
	private float precoVip;
	
	public Vip(int id, String tipoShow, int quantidade, float precoVio) {
		super(id, tipoShow, quantidade);
		this.precoVip =precoVio;
		
	}


	public void visualizar() {
		System.out.println(
				" \n Preço do ingresso vip: " + this.precoVip
				);
	}
}
