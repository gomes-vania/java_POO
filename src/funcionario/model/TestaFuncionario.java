package funcionario.model;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Eder", "Secco", 3000.00f, "Publicitário", "Marketing");
		Funcionario funcionario2 = new Funcionario("Fernando", "Tófoli", 10000.00f, "Arquiteto", "Empreendedor");
		
		funcionario1.visualizar();
		funcionario2.visualizar();
	}

}
