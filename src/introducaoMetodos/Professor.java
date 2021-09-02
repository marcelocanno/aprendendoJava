package introducaoMetodos;

public class Professor {
	
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	public String graduacao;
	public String disciplina;
	public String cidade;
	
	
	public void imprime(Professor professor) {
		/*
		System.out.println("Nome : " + professor.nome);
		System.out.println("Cidade : " + professor.cidade);
		System.out.println("CPF : " + professor.cpf);
		System.out.println("Disciplina : " + professor.disciplina);
		System.out.println("Graduação" + professor.graduacao);
		*/
		System.out.println(this.nome);
		System.out.println(this.cidade);
		System.out.println(this.cpf);
		System.out.println(this.disciplina);
		System.out.println(this.graduacao);
	}

}
