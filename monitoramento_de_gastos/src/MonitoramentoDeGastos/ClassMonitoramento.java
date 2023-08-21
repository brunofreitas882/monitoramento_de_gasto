package MonitoramentoDeGastos;

import java.util.Scanner;

public class ClassMonitoramento {
	
	private String objeto;
	private double saldo;
	
	
	public ClassMonitoramento() {
		saldo = 0.0;
	}
	public void setSalario (double salario) {
		this.saldo = salario;
	}
	
	public void saldoatual() {
		System.out.println("Seu saldo é R$ " + saldo);
	}
	
	public void cadastDispesa(double valor) {
		if (saldo >= valor){
		saldo -= valor;
		System.out.printf(objeto + " dispesa cadastrada com sucesso!");
		
		} else {
			System.out.println("você não tem saldo!");
		}
	}
	
	public void menu(int x, double valor) {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.printf("%n1 - Cadastrar Saldo");
			System.out.printf("%n2 - Cadastro de Despesa");
			System.out.printf("%n3 - Vizualizar Saldo");
			System.out.printf("%n0 - Sair");
			System.out.printf("%nR=");
			x = sc.nextInt();
			
			
			
			switch (x) {
			case 0: {
				System.out.println("Volte mais tarde!!");
				break;
			}
			case 1: {
				System.out.println("digite seu salario: ");
				valor = sc.nextDouble();
				setSalario(valor);
				System.out.println("Cadastrado com sucesso!");
				break;
			}
			case 2: {
				System.out.println("digite o nome da sua dispesa:  ");
				objeto = sc.next();
				System.out.println("Digite o valor da sua dispesa: ");
				valor = sc.nextDouble();
				cadastDispesa(saldo);
				
				break;
			}
			case 3: {
				saldoatual();
				break;
			}
			default:
					System.out.println("digite de um numero de 0 a 3!!!");
					break;
			}
		
			
		}while(x != 0);
	}
}
