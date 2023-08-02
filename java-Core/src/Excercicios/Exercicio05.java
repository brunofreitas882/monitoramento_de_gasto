package Excercicios;

public class Exercicio05 {
	public static void main(String[] args) {
		int codigo = 13;
		int codigo2 = 161;
		
		int quanti_produto1 = 2;
		int quanti_produto2 = 4;
		
		double valor01 = 15.30;
		double valor02 = 5.20;
		double total = 0;
		
		total = (valor01 * quanti_produto1) + (valor02 * quanti_produto2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
	}

}
