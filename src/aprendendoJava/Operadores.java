package aprendendoJava;

public class Operadores extends Dados {

	public static void main(String[] args) {
		
				
		System.out.println("---------------------------------------------------------------");
		
		// operadores matemáticos
		int salario = 3800;
		//int salario = 19000;
		int idade = 62;
		int numero1 = 60;
		int numero2 = 20;
		int soma = numero1 + numero2;
		System.out.println("numero1+numero2 : " +  numero1 + " - " +  numero2);
		System.out.println(numero1+numero2 + " -- " + "Diferença da operação antes e depois de uma string.");
		System.out.println("A soma é : " + soma);
		System.out.println("A divisão é : " + (numero1/numero2));
		System.out.println("A multiplicação é : " + (numero1*numero2));
		System.out.println("A subtração é : " + (numero1-numero2));
		System.out.println("A soma é : " + (numero1+numero2));
		
		System.out.println("---------------------------------------------------------------");
		
		// operadores aritiméticos
		
		int numeroInteiro = 20;
		long numeroLong = 20000000L;
		
		double numeroDouble = 10d;
		float numeroFloat = 20f;
		numeroFloat = (float) numeroDouble;
		int resto = 60%2;
		int resto1 = 21%2;
		System.out.println("Resto de uma divisão é : " + resto + "\n" + "Resto1 é : " + resto1);
		System.out.println("O resto é : " + 21%2);
		System.out.println("O resto1 é : " + 60%2);
		System.out.println(numeroDouble);
		
		
		System.out.println("---------------------------------------------------------------");
		
		
		// operadores de comparação
		
		//boolean dezMaiorQueVinte = 10 > 20;
		
		//System.out.println(dezMaiorQueVinte);
		
		//boolean dezMaiorQueVinte = 10 >= 20;
		
		//System.out.println(dezMaiorQueVinte);
		
		//boolean dezMaiorQueVinte = 10 <= 20;
		
		//System.out.println(dezMaiorQueVinte);
		
		//boolean dezMaiorQueVinte = 10 != 20;
		
		//System.out.println(dezMaiorQueVinte);
		
		//boolean dezMaiorQueVinte = 10 == 20;
		
		//System.out.println(dezMaiorQueVinte);
		
		boolean dezMaiorQueVinte = 10 < 20;
		
		System.out.println(dezMaiorQueVinte);
		
		System.out.println("---------------------------------------------------------------");
		
		// formas diferentes de fazer a mesma operação, sempre retorna boolean
		
		System.out.println(5==5);
		System.out.println(5!=5);
		System.out.println(5<5);
		System.out.println(5>5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		
		System.out.println("---------------------------------------------------------------");
		
		// estruturas logicos
		// && significa e --  duas condições iguais
		// || significa ou  -- uma condição diferente da outra 
		
		System.out.println(idade >= 25 && salario <= 5000);
		System.out.println(idade >= 25 || salario <= 5000);
		
		System.out.println("---------------------------------------------------------------");
		
		
		// operadores de atribuição
		
		// =,-=,+=,*=,/=,%=
		
		salario = salario + 5000;
		System.out.println(salario);
		salario += 1000;
		System.out.println(salario);
		salario -= 2500;
		System.out.println(salario);
		salario *= 2;
		System.out.println(salario);
		salario *= 0.25;
		System.out.println(salario);
		salario = salario + (salario *= 0.25);
		System.out.println(salario);
		
		System.out.println("---------------------------------------------------------------");
		
		// controle de fluxo IF - ELSE IF - ELSE
		
		if(salario <= 5000){
			System.out.println("Você não tem IR fonte");
		}else if(salario > 5600) {
			System.out.println("Você terá retenção de IR fonte");
		}else if (salario >= 9000) {
			System.out.println("Seu IR fonte será de 35%");
		}else {
			System.out.println("Você recebera salario integral");
		}
		
		System.out.println("---------------------------------------------------------------");
		
		
		// controle de fluxo -  outra forma
		
		String categoria;
		if(salario < 5000){
			categoria = "Engenheiro";
		}else if(salario > 5600) {
			categoria = "Gerente";
		}else if (salario >= 9000) {
			categoria = "Diretor";
		}else {
			categoria = "Correspondente";
		}
		
		System.out.println(categoria);
		
		
		System.out.println("---------------------------------------------------------------");
		
		// controle de fluxo e tabela verdade
		// operador ternario 
		
		String status;
		if(salario <= 5000){
			status = "Engenheiro";
		}else if(salario > 5600) {
			status = "Gerente";
		}else if (salario >= 9000) {
			status = "Diretor";
		}else {
			status = "Correspondente";
		}
		System.out.println(categoria);
		
		status = salario <= 5000 ? "Sem IR" : "Com IR";
		System.out.println(status);
		
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		// exercico -- if -- else if
		
		// imposto
		// salario <5000 IR 2%
		// salario 5000 && 5600 IR 5%
		// salario 5600 && 9000 IR 15%
		// salario acima 9000 IR 35%
		
		*/
		
		int imposto = 0;
		//salario = 1000;
		//salario = 3000;
		salario = 19000;
		double impostoTotal = 0;  
		if(salario < 5000) {
			impostoTotal = salario * 0.02;
		}else if(salario >= 5000 && salario <= 5600) {
			impostoTotal = salario * 0.05;
		}else if(salario > 5600 && salario < 9000) {
			impostoTotal = salario * 0.15;
		}else {
			impostoTotal = salario * 0.35;
		}
		
		System.out.println("Valor imposto : " + impostoTotal +  "   Função :  "  + categoria);
		
		
		System.out.println("---------------------------------------------------------------");
		
		
		
		
		System.out.println("---------------------------------------------------------------");
	}
}