package test;

import java.util.Scanner;

import entities.ExploradorRobo;

public class TestsRobos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ExploradorRobo robo01, robo02;
		robo01 = new ExploradorRobo();
		robo02 = new ExploradorRobo();
		
		System.out.println("Informe o nome do primeiro robo: ");
		robo01.nome = sc.next();
		
		System.out.println("Informe o status do primeiro robo: ");
		robo01.status = sc.next();
		
		System.out.println("Informe velocidade do primeiro robo: ");
		robo01.velocicade = sc.nextInt();
		
		System.out.println("Informe a temperatura do primeiro robo: ");
		robo01.temperatura = sc.nextDouble();
		
		System.out.println("-------------------------------");
		
		robo01.verificarTemperatura();
		robo01.exibirAtributos();
		
		System.out.println("Informe o nome do segundo robo: ");
		robo02.nome = sc.next();
		
		System.out.println("Informe o status do segundo robo: ");
		robo02.status = sc.next();
		
		System.out.println("Informe velocidade do segundo robo: ");
		robo02.velocicade = sc.nextInt();
		
		System.out.println("Informe a temperatura do segundo robo: ");
		robo02.temperatura = sc.nextDouble();
		
		System.out.println("-------------------------------");
		
		robo02.verificarTemperatura();
		robo02.exibirAtributos();
		
	sc.close();
	}

}
