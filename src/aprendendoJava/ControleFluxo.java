package aprendendoJava;

public class ControleFluxo extends Operadores{

	public static void main(String[] args) {
		
		//controle fluco swith
		
		System.out.println("------------------------------------------------------");
		System.out.println("           Aprendendo a fazer melhor                  ");
		System.out.println("------------------------------------------------------");
		
		//byte dia = 5;
		//byte dia = 6;
		byte dia = 3;
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
		}
		
		System.out.println("------------------------------------------------------");
		
		//String sexo = "G";
		String sexo = "M";
		switch(sexo) {
		case "F":
			System.out.println("Feminino");
			break;
		case "M" :;
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("------------------------------------------------------");
		

	}

}
