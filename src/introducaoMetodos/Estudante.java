package introducaoMetodos;

public class Estudante {
	/*
	public String nome;
	public int idade;
	public double[] notas;
	*/
	
	private String nome;
	private int idade;
	private double[] notas;
	
	
	public void print() {
		System.out.println("nome : " + this.nome);
		System.out.println("Idade : " + this.idade);
		if(notas != null) {
			for(double nota : notas) {
				System.out.print("Nota : " + nota + " ");
			}
		
		}
		
	}	
	public void tirarMedia() {
		double media = 0;
		for(double nota : notas) {
			media += nota;
		}
	
		media = media / notas.length;
		
		if(media > 6) {
			System.out.println("A média é : " + media + "\n" + "Você foi aprovado");
		}else {
			System.out.println("A média é : " + media + "\n" + "Infelismente você foi reprovado");
		}
		System.out.println("-------------------------------------------------------------");		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
}
