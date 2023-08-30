package aplication;

import java.awt.JobAttributes;
import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Conta;

public class Start_Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Conta conta;
		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta", "Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do dona da conta","Abertura de conta", JOptionPane.PLAIN_MESSAGE);
		
		String seraQueVaiTerDeposito = JOptionPane.showInputDialog(null, "Terá depósito", "Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		seraQueVaiTerDeposito = seraQueVaiTerDeposito.toUpperCase();
		char temDEpositoSimNao = seraQueVaiTerDeposito.charAt(0);
		
		if(temDEpositoSimNao == 'Y' + 'S') {
		double depositoInicial	= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para depósito","Abertura de conta", JOptionPane.PLAIN_MESSAGE));
		conta = new Conta (numeroConta, donoConta, depositoInicial);
		} else {
			conta = new Conta (numeroConta, donoConta);
		}
		
		//Solitar um depósito.
		double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do depósito", "Depósito em conta", JOptionPane.PLAIN_MESSAGE));
		conta.deposito(deposito);
		
		
		JOptionPane.showMessageDialog(null, conta, "Dados na conta", JOptionPane.INFORMATION_MESSAGE);
		
		//Solicitar um saque
		double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor para saque", "Saque da conta", JOptionPane.PLAIN_MESSAGE));
		conta.saque(saque);
		
		//mostrar os dados da conta
		JOptionPane.showMessageDialog(null, conta, "Dados na conta", JOptionPane.INFORMATION_MESSAGE);
	}

}
