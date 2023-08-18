package entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	/*Constutores...*/
	
	/*Costrutor Padrão*/
	/*-----------------------------------------------------------*/
	
	public Produto() {
		
	}
	
	/*Costrutores Personalizados (com sobrecarga)*/
	/*-----------------------------------------------------------*/
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	} 
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	/*Gets e Sets*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getpreco() {
		return preco;
	}
	
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getquantidade() {
		return quantidade;
	}
	
	/*Métodos*/
	/*-----------------------------------------------------------*/
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;      /* +=: Encremento */
	}
		
		public  void removeProduto(int quantidade) {
			this.quantidade -= quantidade;    /* -=: Decremento */
		}
		
		public String toString( ) {
			return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + "unidades, Total: R$ "
		+ String.format("%.2f", valorTotalEmEstoque());
		}
}

