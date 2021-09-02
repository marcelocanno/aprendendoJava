package aprendendoJava;

public class AprendendoArraysMul {

	public static void main(String[] args) {
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		int [] arrInt = {1,2,3};
		int [] arrInt2 = new int [3];
		int [] arrInt3 = new int [] {1,2,3};
		
		/*
		int [][] dias = new int[3][];
		dias[0] = new int[2];
		dias[1] = new int[] {1,2,3};
		dias[2] = new int[4];
		
		for (int [] arr : dias) {
			for (int num : arr) {
				System.out.println(num);
			
		}
		*/
		
		System.out.println("------------------------------------------------------");
		
		int[][] dias = {{ 0,0} , {1,2,3},{0,0,0,0}};
		for (int [] arr : dias) {
			for(int num : arr) {
				System.out.println(num );
			}
		
		
		
		System.out.println("------------------------------------------------------");

	}

	}
}
