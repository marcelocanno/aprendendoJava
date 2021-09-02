package introducaoMetodos;

public class CalculaMetodos extends Calculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		int num1 = 5;
		int num2 = 10; 
		
		calc.alteraDoisNumeros(num1,num2);
		System.out.println("               Dentro do test                        ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Numero 1 : " + num1);
		System.out.println("Numero 2 : " + num2);
		
	}
	public void somaArryas(int[] numeros) {
		int soma = 0;
		for(int num : numeros) {
			soma += soma;
		}
		System.out.println(soma);
	}
	

}
