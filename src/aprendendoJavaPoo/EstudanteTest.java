package aprendendoJavaPoo;

public class EstudanteTest extends Estudante {

	public static void main(String[] args) {
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("                 Introdução POO                       ");
		System.out.println("------------------------------------------------------");
			
		Estudante joao = new Estudante();
		joao.nome = "João";
		joao.matricula = "1212";
		joao.idade = 15;
		
		
		System.out.println("Matricula : " + joao.matricula);
		System.out.println("Nome : " + joao.nome);
		System.out.println("Idade: " + joao.idade);
	}

}
