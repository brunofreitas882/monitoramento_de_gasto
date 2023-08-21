package MonitoramentoDeGastos;

import java.awt.Menu;
import java.util.Locale;
import java.util.Scanner;

public class main_monitoramento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		ClassMonitoramento monitoramento = new ClassMonitoramento();
		

		monitoramento.menu(0, 0);
	}

}
