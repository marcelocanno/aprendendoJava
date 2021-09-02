package aprendendoJava;

public class AprendendoArraysMulti {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("                Arrays multidimensionais              ");
		System.out.println("------------------------------------------------------");
		
		int[][] dias = new int[2][2];
		
		dias [0][0] = 24;
		dias [0][1] = 31;
		dias [1][0] = 23;
		dias [1][1] = 20;
		
		for (int i = 0; i<dias.length;i++) {
			System.out.println(dias[i]);
			for (int j = 0; j<dias.length;j++) {
				System.out.println(dias[i][j]);
			}
		}
		
		
		System.out.println("------------------------------------------------------");
		
		
		for(int[] ref : dias) {
			for(int dia : ref) {
				System.out.println(dia);
			}
			
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("------------------------------------------------------");
		
		
		
		
	}

}
