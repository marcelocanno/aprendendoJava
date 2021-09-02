package SobreCarga;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	// sobrecarga de construtores
	
	public Funcionario(String nome,String cpf, double salario, String rg) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.salario = salario;
		 this.rg = rg;
		 
	}
	
	public Funcionario() {
		 
	}
	// sobrecarga de construtores
	
	public void init(String nome, String cpf,double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void init(String nome, String cpf,double salario,String rg) {
		init(nome,cpf,salario);
		this.rg = rg;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.rg);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return  nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getcpf() {
		return cpf;
	}
	public void setsalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
}
