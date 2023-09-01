package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		/**
		 * sintaxe para implementar uma lista
		 * List<tipo da lista> nome = new ArrauList<>();
		 * 
		 * */
		
		
		// Implementar lista tipo String
		List<String> lista = new ArrayList<>();
		
		System.out.println("-------------Adicionar elementos a lista.-------------------------");
		// Adicionar elementos a lista.
		lista.add("Matemática");// 0
		lista.add("Física");// 1
		lista.add("Biologia");// 2
		lista.add("Português");// 3
		lista.add("Geografia");// 4
		lista.add("História");// 4
		
		// Percorre os elementos da lista.
		
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		System.out.println("-------------Inserir elemento entre um nodo.-------------------------");
		// Inserir elemento entre um nodo.
		lista.add(3, "Química");
		lista.add("Inglês");// 6
		lista.add(5, "Programação");
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		System.out.println("------------------Verificar o tamanho da lista.-----------------");
		// Verificar o tamanho da lista.
		System.out.println("A lista possui um tamanho de " + lista.size() + " posições.");
		System.out.println(lista.get(3));
		
		System.out.println("----------------Remover elemento da lista.---------------------");
		// Remover elemento da lista.
		lista.remove(2);
		lista.remove("Física");
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		System.out.println("------------------Listar a posição de um elemento.---------------------");
		// Listar a posição de um elemento.
		System.out.println("Index de inglês: " + lista.indexOf("Inglês"));
		
		
		System.out.println("------------------Trabalhar com predicado.---------------------");
		// Trabalhar com predicado.
		// remover todos os elementos que iniciem com letra G.
		// Para remover um elemento utilizamdo predicado, usando o método removeIf.
		
		lista.removeIf(disciplina -> disciplina.charAt(0) == 'G');
		lista.removeIf(disciplina -> disciplina.charAt(4) == 'm');
		lista.removeIf(disciplina -> disciplina.charAt(5) == 'm');
		
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		
	}

}
