package construtores;

public class Mergulhador { 
	
	private String nome;
	private String matricula;
	private double[] notas;
	private String dataMatricula;
		
	
	
	public Mergulhador () {
		
	}
	
	public Mergulhador (String nome, String matricula, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;	
	}
	// chamando construtor dentro construtor - sobrecarga
	
	public Mergulhador (String nome, String matricula, double[] notas, String dataMatricula) {
		this(nome,matricula,notas);
		//this.nome = nome;
		//this.matricula = matricula;
		//this.notas = notas;	
		this.dataMatricula = dataMatricula;
	}
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		System.out.println(this.dataMatricula);
		
		for(double nota: notas){
			System.out.println(nota );
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
