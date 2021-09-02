package blocosinicializacao;

public class Cliente {

	// Alocado espa�o na memoria para o objeto que ser� criado
	// Cada atributo de classe � criado e inicializado com seus valores default ou valores explicitos
	// Bloco de inicializa��o � executao
	// O Construtor � inicializado
	
	private int[] parcelas;
	{
		parcelas = new int[100];
		System.out.println();
		for(int i = 1; i <= 100; i++) {
			parcelas[i-1] = i;
		}
	}
 	public Cliente() {
 		
 	}
	public int[] getParcelas() {
		return parcelas;
	}
	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
}
