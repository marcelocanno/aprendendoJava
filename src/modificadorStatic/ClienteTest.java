package modificadorStatic;

public class ClienteTest extends Cliente{

	public static void main(String[] args) {
		
		Cliente client = new Cliente();
		Cliente client1 = new Cliente();
		Cliente client2 = new Cliente();
		System.out.println("Exibindo quantidade de parcelas possíveis");
		for(int parcela : client.getParcelas()) {
			System.out.print(parcela + "-");
		}
		
		
		System.out.println("\n" + client.getParcelas().length);
		System.out.println(client1.getParcelas().length);
		System.out.println(client2.getParcelas().length);
	}

}
