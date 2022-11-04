package funcionario.model;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private float salario;
	private String cargo;
	private String setor;
	
	public Funcionario(String nome, String sobrenome, float salario, String cargo, String setor) {
		//super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		this.cargo = cargo;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		System.out.println(
				" \n Nome: " + this.nome +
				" \n Sobrenome: " + this.sobrenome +
				" \n Salário: " + this.salario +
				" \n Cargo: " + this.cargo +
				" \n Setor: " + this.setor);
		
	}
	
}
