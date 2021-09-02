package aprendendoJava;

public class ControleFor {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------");
		System.out.println("       Controle de fluxo FOR - WHILE - DO WHILE       ");
		System.out.println("------------------------------------------------------");
		
		int contador = 0;
		while (contador < 10) {
			System.out.println(contador);
			contador ++;
		}
		
		System.out.println("------------------------------------------------------");
		
		do {
			System.out.println("contador");
		}while(contador <10);
			
		System.out.println("------------------------------------------------------");
		
		int i = 0;
		for( i = 0; i<10; i++) {
			System.out.println("Print valor de I : " + i);
		}
		
		System.out.println("------------------------------------------------------");
		
		int j = 0;
		for( j = 0; j<10; j++) {
			System.out.println("Print valor de J : " + j);
			if(j==5) {
				break;
			}
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("------------------------------------------------------");
		
	}

}
