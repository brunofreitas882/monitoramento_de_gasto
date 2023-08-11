package Variaveis;

public class Logicas {

	public static void main(String[] args) {
		double x = 5;
		
		System.out.println(x <= 20 && x ==10);
		
		System.out.println(x > 0 && x != 3);
		
		System.out.println(x <= 20 && x == 10 && x != 3);
		
		System.err.printf("-----------------------------------------");
		
		System.out.println(x <= 0 || ( x != 3 && x != 5));
		
	}

}
