package Excercicios;

import java.util.List;
import java.util.Scanner;

public class Start_Biblioteca {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Iforme o código do livro: ");
        String idLivro = sc.nextLine();
        System.out.println("Informe o título do livro: ");
        String obra = sc.nextLine();
        System.out.println("Informe o autor do livro: ");
        String autor = sc.nextLine();
        System.out.println("Informe o ano de publicação do livro: ");
        String ano = sc.nextLine();
        System.out.println("Informe gênero do livro: ");
        String genero = sc.nextLine();
        System.out.println("Informe a editora do livro: ");
        String editora = sc.nextLine();
        System.out.println("Informe a quantidade de páginas do livro: ");
        String paginas = sc.nextLine();
        
        // Instanciar um objeto livro
        Livros livros = new Livros();
        
        // Adcionar um livro
        livros.adicionarLivros(idLivro, obra, autor, ano, genero, editora, paginas);
        
        // Listar os elementos da lista Livros
        List<String> titulos = livros.getTitulos();
        
        for (String titulo : titulos) {
			System.out.println(titulos);
		} 
        
        
        sc.close();
	}
}
