package introducaoMetodos;

public class ProfessorTest {

	public static void main(String[] args) {
		
		Professor professor = new Professor() ;
		professor.cidade = "Recife";
		professor.cpf = "345669877";
		professor.disciplina = "Historia";
		professor.nome = "Walter";
		professor.graduacao = "Inglês";
		
		Professor professor2 = new Professor() ;
		professor2.cidade = "Curitiba";
		professor2.cpf = "876.789.789.98";
		professor2.disciplina = "Matematica";
		professor2.nome = "Julio";
		professor2.graduacao = "Ciencias";
		
		professor.imprime(professor);
		
		System.out.println("------------------------------------------------------");
		
		professor2.imprime(professor2);
	}

}
