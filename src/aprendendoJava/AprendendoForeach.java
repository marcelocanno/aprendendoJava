package aprendendoJava;

public class AprendendoForeach {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("              Aprendendo Foreach                      ");
		System.out.println("------------------------------------------------------");
		System.out.println("           Formas diferentes de Arrays                ");
		System.out.println("------------------------------------------------------");
		
		
		int [] numeros = new int[5];
		int [] numeros2 = {1,2,3,4,5};
		int [] numeros3 = new int[] {1,2,3,4,5};
		
		System.out.println("------------------------------------------------------");
		
		for(int i = 0; i < numeros2.length; i ++) {
			System.out.println(numeros2[i]);
		}
		
		System.out.println("------------------------------------------------------");
		
		for(int aux : numeros2) {
			System.out.println(aux);
		}
		
		System.out.println("------------------------------------------------------");
		
		for(int num : numeros3) {
			System.out.println(num);
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		String[] nomes = {"Marcelo", "walter", "Paulo", "Roberto", "Joaquim"};
			for(String nome : nomes) {
				System.out.println(nome);
			}
		
		
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("------------------------------------------------------");
		
		
		
		
	}

}
