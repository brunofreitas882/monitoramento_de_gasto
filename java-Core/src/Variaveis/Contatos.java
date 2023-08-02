package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//String nome;
		///String email;
		//long telefone;
		
		System.out.println("Insira o seu nome: ");
		String nome = sc.next();
		System.out.println("Insira o seu email: ");
		String email = sc.next();
		System.out.println("Insira o número do seu telefone: ");
		long telefone = sc.nextLong();
		
		System.out.printf("nome: %s%nemail: %s%ncelular: %d",nome, email, telefone);
		
		sc.close();
		
	}

}
