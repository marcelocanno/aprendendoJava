package introducaoMetodos;

public class CalculadoraTest extends Calculadora {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		
		Calculadora calc = new Calculadora();
		
		System.out.println("------------------------------------------------------");
		
		calc.somaDoisNumeros();
		calc.multiplicacaoDoisNumeros(5,5);
		calc.subitracaoDoisNumeros();
		calc.imprimiDoisNumerosDivididos(20, 2);
		
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(calc.divideDoisNumeros(20, 2));
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Sucesso execusão");

		System.out.println("------------------------------------------------------");
		
		int[] numeros = {1,2,3,4,5};
		calc.somaArryas(numeros);
		
		
		System.out.println("------------------------------------------------------");
	}

}
