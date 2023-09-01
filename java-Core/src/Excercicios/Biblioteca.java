package Excercicios;
import java.util.ArrayList;
import java.util.List;

class Livros {
  
   private List<String> titulos;

    public Livros() {
        this.titulos = new ArrayList<>();
    }

    public void adicionarLivros(String idLivros, String titulos, String nomeAutor, String ano, String genero, String editora, String pagina) {
    	this.titulos.add("idLivro: " + idLivros + " - " +"titulo: " +  titulos + " - " +"Autor: " +  nomeAutor + " - " +"Ano do livro: " + ano + " - " +"genêro do livro: " + genero + " - "
    +"editora: " +  editora + " - " +"paginas: " + pagina);
    }
    
    
    public List<String> getTitulos() {
    	return titulos;
    }
    
    // Listar a quantidade de elementos da lista
    public void exibirQuantidadeElementos() {
    	System.out.println("A lista contém " + this.titulos.size() + "elementos.");
    }
    
    // Remover livro
    public void removerLivro(String titulo) {
    	// Encontrar o índece do elemento a ser removido
    	int index = this.titulos.indexOf(titulo);
    	
    	// Remover o elemento da lista
    	this.titulos.remove(index);
    }
}


