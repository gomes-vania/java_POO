package funcionario.model;

public class Vendedor extends Funcionario{
	
	private int id;

	public Vendedor(String nome, String sobrenome, float salario, String cargo, String setor, int id) {
		super(nome, sobrenome, salario, cargo, setor);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Vendedor [id=" + id + "]");
	}

}
