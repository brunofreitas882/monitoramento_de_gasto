package Variaveis;

public class Introducao {

	public static void main(String[] args) {
		// Variáveris locais.
		
		double x = 10.35784;
		System.out.println(x);																	//$f = ponto flutuante
																								//%d = inteiro
																								//%s = texto
																								//%n = quebra de linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$: %.2f reais%n", nome, idade, renda);
		
	}

}