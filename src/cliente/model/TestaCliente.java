package cliente.model;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Vânia", "Gomes", "F", "123.456.789.0", 123456);
		Cliente cliente2 = new Cliente("Vanessa", "Gomes", "F", "123.456.789.0", 123456);
		
		cliente1.visualizar();
		cliente2.visualizar();
	}

}
