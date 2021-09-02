package aprendendoJava;

public class ComandoBreak {

	public static void main(String[] args) { 
		
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("           controle de fluxo                           ");
		System.out.println("------------------------------------------------------");
		
		// valor carro quantas vezes pode ser parcelado
		// valor das parcelas maiores de mil
		// duas maneiras de fazer economizando linhas de codigo
		
		
		/* double valorTotal= 30000;
		for(int parcela = 1; (int) parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
				if(valorParcela >= 1000) {
					System.out.println("Parcela :  " + parcela +  "  R  "  + valorParcela );
			}
			}
			
			*/
		
				
		 int valorTotal2= 55000;
			for(int parcela2 =  valorTotal2; parcela2 >=1; parcela2--) {
				int valorParcela2 = valorTotal2 / parcela2;
					if(valorParcela2 >= 3000) {
						System.out.println("parcela : " + parcela2 + "  UU$  " + valorParcela2 );
					}
				
				
			}
				
			
		
				System.out.println("------------------------------------------------------");
		}
	}

	

	
	
	


