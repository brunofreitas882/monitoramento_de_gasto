package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double areaDeX;
		double areaDeY;
		
		Triangulo X, Y;
		X = new Triangulo("X");
		Y = new Triangulo("Y");
		//Triangulo Y = new Triangulo();
		
		//area X
		System.out.println("Informe os valores do triângulo X: ");
		X.ladoA = sc.nextDouble();
		X.ladoB = sc.nextDouble();
		X.ladoC = sc.nextDouble();
		
		// area Y
		System.out.println("Informe os valores do triângulo Y: ");
		Y.ladoA = sc.nextDouble();
		Y.ladoB = sc.nextDouble();
		Y.ladoC = sc.nextDouble();
		
		areaDeY = Y.area();
		areaDeX = X.area();
		
		
		System.out.printf("a area de Y é: %.2f %n", areaDeY);
		System.out.printf("a area de X é: %.2f %n", areaDeX);
		
		Y.tamTriangulo();
		X.tamTriangulo();
		
		
		
		sc.close();
	}

}
