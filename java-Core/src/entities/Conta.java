package entities;

public class Conta {
	private int numeroConta;
	private String donoConta;
	private double saldoConta;
	
	//-------------------------------------------------------------------------------------
	//Contrutores
	public Conta(int numeroConta, String donoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
	}
	
	public Conta(int numeroConta, String donoConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}
	
	//-------------------------------------------------------------------------------------
	//métodos gets e sets
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	//-------------------------------------------------------------------------------------
	
	//método depósito 
	public void deposito(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	
	//método de saque 
	public void saque(double valorDeposito) {
		saldoConta -= valorDeposito + 5.00;
	}
	
	//método toString sobrecarregado.
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta: " + numeroConta + "\nproprietário: " + donoConta + String.format("\nSaldo da conta: %.2f", saldoConta);
	}
}
