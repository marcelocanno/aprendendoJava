package aprendendoJavaPoo;

public class EstudanteTest extends Estudante {

	public static void main(String[] args) {
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("                 Introdu��o POO                       ");
		System.out.println("------------------------------------------------------");
			
		Estudante joao = new Estudante();
		joao.nome = "Jo�o";
		joao.matricula = "1212";
		joao.idade = 15;
		
		
		System.out.println("Matricula : " + joao.matricula);
		System.out.println("Nome : " + joao.nome);
		System.out.println("Idade: " + joao.idade);
	}

}
