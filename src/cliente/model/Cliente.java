package cliente.model;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private String cpf;
	private int rg;
	
	//---Generate constructor using Fields...
	
	public Cliente(String nome, String sobrenome, String sexo, String cpf, int rg) {
		//super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public void visualizar() {
		System.out.println(
				" \n Nome: " + this.nome +
				" \n Sobrenome: " + this.sobrenome +
				" \n Sexo: " + this.sexo +
				" \n CPF: " + this.cpf +
				" \n RG: " + this.rg);
		
	}
		

}
