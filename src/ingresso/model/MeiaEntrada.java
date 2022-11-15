package ingresso.model;

public class MeiaEntrada extends Ingresso {
	private float precoMeiaEntrada;

	public MeiaEntrada(int id, String tipoShow, int quantidade, float precoMeiaEntrada) {
		super(id, tipoShow, quantidade);
		this.precoMeiaEntrada =precoMeiaEntrada;
	}

	public float getPrecoMeiaEntrada() {
		return precoMeiaEntrada;
	}

	public void setPrecoMeiaEntrada(float precoMeiaEntrada) {
		this.precoMeiaEntrada = precoMeiaEntrada;
	}
	
	public void visualizar() {
		System.out.println(
				" \n Preço do ingresso meia entrada: " + this.precoMeiaEntrada
				);
	}

}
