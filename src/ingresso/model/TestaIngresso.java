package ingresso.model;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso(1, 100.00f, 50.00f, "Peça de teatro", 4);
		Ingresso ingresso2 = new Ingresso(2, 70.00f, 35.00f, "Show Alunos Clac", 2);
	
		ingresso1.visualizar();
		ingresso2.visualizar();
		
	}

}