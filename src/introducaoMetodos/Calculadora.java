package introducaoMetodos;

public class Calculadora {
	
	public void somaDoisNumeros () {
		System.out.println(5+5);
	}
	public void subitracaoDoisNumeros() {
		System.out.println(5-5);
	}
	public void multiplicacaoDoisNumeros(int num1, int num2) {
		System.out.println(num1*num2);
	}
	/*
	public double divideDoisNumeros(double num1,double num2) {
		double resultado = num1/num2;
		return resultado;
	}
	*/
	public double divideDoisNumeros(double num1, double num2) {
		//System.out.println(num1/num2);
		if(num2 != 0) {
			return num1 / num2;
		}
		return 0;
	}
	
	
	
	public void imprimiDoisNumerosDivididos(double num1, double num2) {
		if(num2 !=0) {
			System.out.println(num1/num2);
			return;
			
		}
		System.out.println("Não é possivel dividir por zero");
		System.out.println("------------------------------------------------------");
	}
	

	
	public void alteraDoisNumeros(int num1,int num2) {
		num1 = 30;
		num2 = 40;
		// dentro do altera dois numeros
		
		System.out.println("Numero 1 : " + num1);
		System.out.println("Numero 2 : " + num2);
		System.out.println("------------------------------------------------------");
	}
	
	public void somaArryas(int[] numeros) {
		int soma = 0;
		for(int num : numeros) {
			soma += soma;
		}
		System.out.println(soma);
	}
	
	}
	


