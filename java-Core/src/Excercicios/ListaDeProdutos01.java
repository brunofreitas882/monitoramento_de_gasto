package Excercicios;

import java.util.DuplicateFormatFlagsException;

public class ListaDeProdutos01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("products:%n%s which prince is $ %.2f %n", product1, price1);
		System.out.printf("%s, which prince is $ %.2f", product2, prince2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %s", age, code, gender);
		
	}

}
