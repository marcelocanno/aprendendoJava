package modificadorStatic;

public class Carro {
	
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;
	
	
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Carro() {
		
	}
	
	public void imprime() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Nome do ve�culo : " + this.nome);
		System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite: " + velocidadeLimite);
		System.out.println("--------------------------------------------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
