package entities.heranca;

/**
 * Representa uma conta bancaria de uma empresa
 * 
 * @author Bruno-Freitas
 * @version 1.0
 *
 */
public class ContaEmpresa extends Conta {
	/**
	 * Limite para realização de empréstimo
	 */
	private Double limiteEmprestimo;

	/**
	 * Construtor padrão
	 */
	public ContaEmpresa() {

	}

	/**
	 * Construtor personalizado.
	 * 
	 * @param numeroConta      Representa o número da conta, herdando do pai.
	 * @param titularConta     Representa o titular da conta, herdado do pai.
	 * @param saldoConta       Representa o saldo da conta, herdado do pai.
	 * @param limiteEmprestimo Representa o limite prara empréstimo.
	 */
	public ContaEmpresa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
		super(numeroConta, titularConta, saldoConta);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	/**
	 * Define o limite de empréstimo da conta.
	 * @param limiteSaque representa o novo limite para empréstimo da conta.
	 * */

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	/**
	 * Realizar um empréstimo na conta empresa.
	 * @param quantidade representa o valor do empréstimo.
	 * */
	
	public void emprestimo(double quantidade) {
		if(quantidade <= limiteEmprestimo) {
			deposito(quantidade);
		}
	}

}
