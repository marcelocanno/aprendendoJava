package aprendendoJavaPoo;

public class CarroTest extends Carro {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------");
		
		Carro carro = new Carro();
		carro.ano = 1982;
		carro.modelo = "Corsa";
		carro.chassi = 89765;
		carro.velocidadeMaxima = 234;
		
		System.out.println(carro.ano);
		System.out.println(carro.modelo);
		System.out.println(carro.chassi);
		System.out.println(carro.velocidadeMaxima);

		System.out.println("------------------------------------------------------");

	}

}
