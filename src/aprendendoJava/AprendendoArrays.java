package aprendendoJava;

public class AprendendoArrays {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("             Aprendendo Arrays                        ");
		System.out.println("------------------------------------------------------");
		
		//byte, short, int, long, float, double  = 0
		//char '\u0000' ' ' 
		//boolean false
		//reference null
		
		// simulações
		
		/*
		int [] idades = new int [3];
		idades[0] = 20;
		idades[1] = 15;
		idades[2] = 30;
		
		System.out.println("Idade 1 : " + idades[0]);
		System.out.println("Idade 2 : " + idades[1]);
		System.out.println("Idade 3 : " + idades[2]);
		
		*/
		
		System.out.println("------------------------------------------------------");
		
		/*
		float [] idades = new float [3];
				
		System.out.println("Idade 1 : " + idades[0]);
		System.out.println("Idade 2 : " + idades[1]);
		System.out.println("Idade 3 : " + idades[2]);
		
		*/
		
		System.out.println("------------------------------------------------------");
		
		/*
		boolean [] idades = new boolean [3];
		
		System.out.println("Idade 1 : " + idades[0]);
		System.out.println("Idade 2 : " + idades[1]);
		System.out.println("Idade 3 : " + idades[2]);
		
		*/
		System.out.println("------------------------------------------------------");
		
		/*
		char [] idades = new char [3];
		
		System.out.println("Idade 1 : " + idades[0]);
		System.out.println("Idade 2 : " + idades[1]);
		System.out.println("Idade 3 : " + idades[2]);
		
		*/
		System.out.println("------------------------------------------------------");
		
		
		/*
		String [] nomes = new String [3];
		nomes [0] = "Marcelo";
		nomes [1] = "Luiz";
		nomes [2] = "Walter";
		for(int i = 0; i < 3; i++) {
			System.out.println(nomes[i] );
		}
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Nome 1 : " + nomes[0]);
		System.out.println("Nome 2 : " + nomes[1]);
		System.out.println("Nome 3 : " + nomes[2]);
		*/
		System.out.println("------------------------------------------------------");
		
		String [] nomes = new String [3];
		nomes [0] = "Marcelo";
		nomes [1] = "Luiz";
		nomes [2] = "Walter";
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] );
		}
		
		System.out.println("------------------------------------------------------");
		
		nomes = new String[5];
		nomes [0] = "San Diego";
		nomes [1] = "Londres";
		nomes [2] = "Toquio";
		nomes [3] = "Singapura";
		nomes [4] = "Hong Kong";
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println((i + 1) + " Nome : " + nomes[i] );
		}
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Cidade de : " + nomes[0]);
		System.out.println("Cidade de : " + nomes[1]);
		System.out.println("Cidade de : " + nomes[2]);
		System.out.println("Cidade de : " + nomes[3]);
		System.out.println("Cidade de : " + nomes[4]);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Nome 1 : " + nomes[0]);
		System.out.println("Nome 2 : " + nomes[1]);
		System.out.println("Nome 3 : " + nomes[2]);
		
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		
		
	}

}
