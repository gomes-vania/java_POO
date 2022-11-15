package cliente.model;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome, String sobrenome, String sexo, int rg, String cpf) {
		super(nome, sobrenome, sexo, rg);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println(
				" \n CPF do cliente: " + this.cpf
				);
		
	}
}
