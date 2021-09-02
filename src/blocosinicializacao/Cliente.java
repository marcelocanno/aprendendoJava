package blocosinicializacao;

public class Cliente {

	// Alocado espaço na memoria para o objeto que será criado
	// Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
	// Bloco de inicialização é executao
	// O Construtor é inicializado
	
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
