package blocosinicializacao;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente client = new Cliente();
		System.out.println("Exibindo quantidade de parcelas poss�veis");
		for(int parcela : client.getParcelas()) {
			System.out.print(parcela + " ");
		}
			
		}
		
		
	}


