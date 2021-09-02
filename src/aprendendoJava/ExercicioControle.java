package aprendendoJava;

public class ExercicioControle extends Dados {

	public static void main(String[] args) {
	
		System.out.println("------------------------------------------------------");
		System.out.println("             Exercicio controle fluxo                 ");
		System.out.println("------------------------------------------------------");
		
		
		// aprensentam numero pares ou impar
		
		int valor = 20;
		for(int i = 0; i <= valor; i++) {
			//if(i%2==0) {
			if(i%2!=0) {
				
				System.out.println(i);
			}
		}
		
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("------------------------------------------------------");

	}
}


