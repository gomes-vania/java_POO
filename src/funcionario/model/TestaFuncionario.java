package funcionario.model;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Eder", "Secco", 3000.00f, "Publicitário", "Marketing");
		Funcionario funcionario2 = new Funcionario("Fernando", "Tófoli", 10000.00f, "Arquiteto", "Empreendedor");
		
		funcionario1.visualizar();
		funcionario2.visualizar();
		
		Gerente funcionario3 = new Gerente("Eder", "Secco", 3000.00f, "Publicitário", "Marketing", 1);
		Gerente funcionario4 = new Gerente("Fernando", "Tófoli", 10000.00f, "Arquiteto", "Empreendedor", 1);
		
		funcionario3.visualizar();
		funcionario4.visualizar();
		
		Vendedor funcionario5 = new Vendedor("Eder", "Secco", 3000.00f, "Publicitário", "Marketing", 2);
		Vendedor funcionario6 = new Vendedor("Fernando", "Tófoli", 10000.00f, "Arquiteto", "Empreendedor",2);
		funcionario5.visualizar();
		funcionario6.visualizar();
		
	}

}
