package Excercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor01 = 0;
		double valor02 = 0;
		double valor03 = 0;
		double area;
		
		System.out.println("primeira area: ");
		valor01 = sc.nextDouble();
		
		System.out.println("segundo area: ");
		valor02 = sc.nextDouble();
		
		System.out.println("terceira area: ");
		valor03 = sc.nextDouble();
		
		area = (valor01 + valor02 + valor03) / 2;
		
		System.out.printf("resultado: %.2f", area);
		
		sc.close();
	}

}
