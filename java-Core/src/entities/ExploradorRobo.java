package entities;

public class ExploradorRobo {
	public String nome;
	public String status;
	public int velocicade;
	public double temperatura;
	
	public void verificarTemperatura() {
		if (temperatura > 45) {
			status = "Retorne imediatamente para a base!";
			velocicade = 5;
		}
	}
	public void exibirAtributos() {
		System.out.println("Nome: " + nome);
		System.out.println("Status: " + status);
		System.out.println("Velocidade: " + velocicade);
		System.out.println("Temperatura: " + temperatura);
	}
}
