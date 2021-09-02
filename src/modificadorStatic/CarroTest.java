package modificadorStatic;

public class CarroTest {

	public static void main(String[] args) {
		
		
		Carro car1 = new Carro("BMW", 268);
		Carro car2 = new Carro("Audi", 256);
		Carro car3 = new Carro("Rover", 265);
		
		car1.imprime();
		car2.imprime();
		car3.imprime();

		System.out.println("-----------------------------------------------------------");
		
		Carro.velocidadeLimite = 200;
		
		car1.imprime();
		car2.imprime();
		car3.imprime();

		System.out.println("-----------------------------------------------------------");
		
		
		
	}

}
