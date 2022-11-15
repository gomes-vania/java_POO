package cliente.model;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String sobrenome, String sexo, int rg, String cnpj) {
		super(nome, sobrenome, sexo, rg);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println(
				" \n CNPJ do cliente: " + this.cnpj
				);
		
	}

}
