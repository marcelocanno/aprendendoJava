package introducaoMetodos;

public class EstudanteTest extends Estudante{
	
	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		estudante.setNome( "Marcos Paulo");
		estudante.setIdade ( 18);
		estudante.setNotas ( new double [ ] {2,1,9}); 
		estudante.print();
		estudante.tirarMedia();
		//System.out.println("Nome : " + estudante.getNome());
		//System.out.println("Idade : " + estudante.getIdade());
		//System.out.println(estudante.getNotas());
	}

}
