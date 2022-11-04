package ingresso.model;

public class Ingresso {
	
	private int id;
	private float precoEntradaInteira;
	private float precoMeiaEntrada;
	private String tipoShow;
	private int quantidade;
	
	public Ingresso(int id, float precoEntradaInteira, float precoMeiaEntrada, String tipoShow, int quantidade) {
		//super();
		this.id = id;
		this.precoEntradaInteira = precoEntradaInteira;
		this.precoMeiaEntrada = precoMeiaEntrada;
		this.tipoShow = tipoShow;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecoEntradaInteira() {
		return precoEntradaInteira;
	}

	public void setPrecoEntradaInteira(float precoEntradaInteira) {
		this.precoEntradaInteira = precoEntradaInteira;
	}

	public float getPrecoMeiaEntrada() {
		return precoMeiaEntrada;
	}

	public void setPrecoMeiaEntrada(float precoMeiaEntrada) {
		this.precoMeiaEntrada = precoMeiaEntrada;
	}

	public String getTipoShow() {
		return tipoShow;
	}

	public void setTipoShow(String tipoShow) {
		this.tipoShow = tipoShow;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizar() {
		
		System.out.println(
				" \n ID do ingresso: " + this.id +
				" \n Preço da entrada inteira: " + this.precoEntradaInteira +
				" \n Preço meia entrada: " + this.precoMeiaEntrada +
				" \n Evento: " + this.tipoShow +
				" \n Quantidade: " + this.quantidade);
	}
	
}
