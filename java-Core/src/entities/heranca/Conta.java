package entities.heranca;
/**
 * Representa uma conta bancária
 * 
 * @author Bruno-Freitas
 * @since 04-09-2023
 * */

public class Conta {
	/**
	 *  O número da conta
	 * */
	private Integer numeroConta;
	
	/**
	 * O titular da conta 
	 * 
	 * */
	private String titularConta;
	
	/**
	 * O saldo da conta
	 * */
	private Double saldoConta;
	
//----------------------------------------------------------------------
	
	public Conta() {
		/**
		 * Criar uma conta com os valores padrões para os atributos 'numeroConta'
		 * e 'titularConta'
		 * */
		this.numeroConta = null;
		this.titularConta = null;
		this.saldoConta = 0.0;
	}
	/**Construtor da classe que recebe os valor para osm atributos personalizados:
	 * 'numeroConta', 'titularConta' e 'saldoConta'
	 * @param numeroConta   Representa o número de uma conta.
	 * @param titularConta  Representa o nome do dono da conta.
	 * @param saldoConta    Representa o atual saldo da conta.
	 * */

	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}
	/**
	 * Obter o número da conta.
	 * 
	 * @return O número da conta.
	 * */
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTitularConta() {
		return titularConta;
	}
	/**
	 * Define o titular da conta.
	 * 
	 * @param titularConta o novo titular da conta
	 * */
	
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	/**
	 *  Obtém do saldo da conta.
	 *  
	 *  @return o saldo da conta.*/
	public Double getSaldoConta() {
		return saldoConta;
	}
	
	/**
	 * Realixa um saque na conta.
	 * @param quantidade Representa o valor para o saque
	 * */
	public void saque(double quantidade) {
		/**
		 * Um saque representa um retirada na conta.
		 * */
		saldoConta -= quantidade;
	}
		/**
		 * Realiza um depósito na conta.
		 * 
		 * @param quantidade Reprensenta o valor para depósito na conta.
		 * */
		public void deposito(double quantidade){
			/**
			 * Um depósito representa uma entrada na conta.
			 * */
		saldoConta += quantidade;		
		}
}
