package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double notasAlunoA[] = new double [3];

	//Atribuição
	notasAlunoA[0] = 5.5;
	notasAlunoA[1] = 4.8;
	notasAlunoA[2] = 8.5;
	
	System.out.println(notasAlunoA); //como o arry é uma objeto, ele retorna um endereço dele na memoria RAM.
	System.out.println(notasAlunoA[0]);
	System.out.println(notasAlunoA[1]);
	System.out.println(notasAlunoA[2]);
	
	//Exibição por meio de método da classe Arrays
	System.out.println(Arrays.toString(notasAlunoA));
	
	// Formas de percorrer um array
	double notas;
	for (int i = 0; i <3; i++) {
		notas = notasAlunoA[i];
		System.out.println(i + ":" + notas);
		//calcular a média das notas
		notas+=notasAlunoA[i];
		
		
	}
	
	}

}
