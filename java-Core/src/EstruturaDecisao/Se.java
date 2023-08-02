package EstruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double v1, v2, v3, v4, v5, totalinformado;
		int quantinumeros = 0;
		
		System.out.println("Informe um valor: ");
		v1 = sc.nextDouble();
		if (quantinumeros == 5 || v1 != 0.00) {
			quantinumeros++;
			System.out.println("quantidade de numeros inseridos é: " + quantinumeros);
		}else {
			System.out.println("voce informou o valor:  " + quantinumeros);
			return;
		}
		
		System.out.println("Informe um valor: ");
		v2 = sc.nextDouble();
		if (quantinumeros == 5 || v2 != 0.00) {
			quantinumeros++;
			System.out.println("quantidade de numeros inseridos é: " + quantinumeros);
		}else {
			System.out.println("voce informou o valor:  " + quantinumeros);
			return;
		}
		
		System.out.println("Informe um valor: ");
		v3 = sc.nextDouble();
		if (quantinumeros == 5 || v3 != 0.00) {
			quantinumeros++;
			System.out.println("quantidade de numeros inseridos é: " + quantinumeros);
		}else {
			System.out.println("voce informou o valor:  " + quantinumeros);
			return;
		}
		
		System.out.println("Informe um valor: ");
		v4 = sc.nextDouble();
		if (quantinumeros == 5 || v4 != 0.00) {
			quantinumeros++;
			System.out.println("quantidade de numeros inseridos é: " + quantinumeros);
		}else {
			System.out.println("voce informou o valor:  " + quantinumeros);
			return;
		}
		
		System.out.println("Informe um valor: ");
		v5 = sc.nextDouble();
		if (quantinumeros == 5 || v5 != 0.00) {
			quantinumeros++;
			System.out.println("quantidade de numeros inseridos é: " + quantinumeros);
			totalinformado = v1 + v2 + v3 + v4 + v5;
			System.out.printf("voce informou o valor: %.2f" , totalinformado);
		}else {
			System.out.println("A soma dos valores é:  " + quantinumeros);
		}
	}

}
