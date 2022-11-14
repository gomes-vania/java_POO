package cliente.model;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Vânia", "Gomes", "F", 123456);
		Cliente cliente2 = new Cliente("Vanessa", "Gomes", "F", 123456);
		
		cliente1.visualizar();
		cliente2.visualizar();
		
		PessoaFisica cliente3 = new PessoaFisica("Alice" , "Ferreira", "F", 123456, "123.456.789.0");
		PessoaFisica cliente4 = new PessoaFisica("Deborah" , "Almeida", "F",  123456, "321.654.987.0");
		
		cliente3.visualizar();
		cliente4.visualizar();
		
		PessoaJuridica cliente5 = new PessoaJuridica("Alice" , "Ferreira", "F", 123456, "1234567890");
		PessoaJuridica cliente6 = new PessoaJuridica("Alice" , "Ferreira", "F", 123456, "1234567811");
		
		cliente5.visualizar();
		cliente6.visualizar();
		
	}

}
