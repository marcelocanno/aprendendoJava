package aprendendoJava;

public class ExercicioFluxo extends Dados{

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------");
		System.out.println("                   Exercicio Fluxo                    ");
		System.out.println("------------------------------------------------------");
		
		//byte dia = 1;
		byte dia = 3;
		switch (dia) {
		case 1 :
		case 7 :
			System.out.println("Fim de semana");
			break;
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Dias úteis");
			break;
			default :
				System.out.println("Opção invalidada");
		}
		
		System.out.println("------------------------------------------------------");
		
		//byte dia = 3;
		switch(dia ){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
				
			default :
				System.out.println("Opção inválida");
		}
		
		
		System.out.println("------------------------------------------------------");

		
		System.out.println("------------------------------------------------------");
	}

}	
