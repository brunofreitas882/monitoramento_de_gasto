package util;

public class Calculadora {
		public final double PI = 3.14159;
		
	public double cincunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public double volume(double raio) {
		// V = 4. p. R/3
		
		return 4.0 * PI * (Math.pow(raio, 3) / 3.0);
	}
}
