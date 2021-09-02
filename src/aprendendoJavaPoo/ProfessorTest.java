package aprendendoJavaPoo;

public class ProfessorTest extends Professor{

	public static void main(String[] args){
		
		System.out.println("------------------------------------------------------");
		
		Professor professor = new Professor() ;
		professor.cidade = "Recife";
		professor.cpf = "345669877";
		professor.disciplina = "Historia";
		professor.idade = 45;
		professor.nome = "Walter";
		
		Professor professor2 = new Professor() ;
		professor2.cidade = "Curitiba";
		professor2.cpf = "876.789.789.98";
		professor2.disciplina = "Matematica";
		professor2.idade = 65;
		professor2.nome = "Julio";
		
		
		
		
		System.out.println("------------------------------------------------------");
		
		Estudante estudante = new Estudante();
		estudante.disciplina = "Historia";
		estudante.nome = "Luiz";
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Nome : " + professor.nome);
		System.out.println("Cidade : " + professor.cidade);
		System.out.println("CPF : " + professor.cpf);
		System.out.println("Disciplina : " + professor.disciplina);
		System.out.println("Graduação" + professor.graduacao);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println( "Aluno : " + estudante.nome + " " + " Disciplina : " + professor.disciplina + "    Professor : " + professor.nome );
		
		
		System.out.println("------------------------------------------------------");
		
	}	

	

}
