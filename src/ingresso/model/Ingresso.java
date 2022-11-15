package ingresso.model;

public class Ingresso {
	
	private int id;
	private String tipoShow;
	private int quantidade;
	
	public Ingresso(int id, String tipoShow, int quantidade) {
		//super();
		this.id = id;
		this.tipoShow = tipoShow;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
				" \n Evento: " + this.tipoShow +
				" \n Quantidade: " + this.quantidade);
	}
	
}
