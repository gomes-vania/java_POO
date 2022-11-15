
package ingresso.model;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso(1, "Peça de teatro", 4);
		Ingresso ingresso2 = new Ingresso(2, "Show Alunos Clac", 2);
	
		ingresso1.visualizar();
		ingresso2.visualizar();
		
		Vip vip1= new Vip(1, "Peça de teatro", 4, 100.00f);
		Vip vip2= new Vip(2, "Show Alunos Clac", 2, 50.00f);
		
		vip1.visualizar();
		vip2.visualizar();
		
		MeiaEntrada me1 = new MeiaEntrada(1, "Rock", 2, 200.00f);
		MeiaEntrada me2 = new MeiaEntrada(2, "Pop", 3, 150.00f);
		
		me1.visualizar();
		me2.visualizar();
		
		
	}

}
