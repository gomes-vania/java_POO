package ingresso.model;

public class Vip extends Ingresso {
	
	private String lugarVip;

	public Vip(int id, float precoEntradaInteira, float precoMeiaEntrada, String tipoShow, int quantidade, String lugarVip) {
		super(id, precoEntradaInteira, precoMeiaEntrada, tipoShow, quantidade);
		this.lugarVip = lugarVip;
	}

	public String getLugarVip() {
		return lugarVip;
	}

	public void setLugarVip(String lugarVip) {
		this.lugarVip = lugarVip;
	}
	
	public void visualizar() {
		System.out.println(
				" \n Lugar vip: " + this.lugarVip
				);
	}
}
