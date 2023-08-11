package entities;

public class Triangulo {
// Atributos da classe
	public double ladoA;
	public double ladoB;
	public double ladoC;
	public String nome;
	
	public Triangulo(String nome) {
		this.nome = nome;
	}
// método área
	public double area() {
	double pX = (ladoA + ladoB + ladoC) / 2;
	// Calcular área de X
	return Math.sqrt(pX * (pX - ladoA) * (pX - ladoB) * (pX - ladoC));

	}
	
	public void tamTriangulo() {
		if((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB+ladoC >ladoA)){
		    if(ladoA == ladoB && ladoA == ladoC){
		        System.out.println("Triangulo " + nome + " equilatero.");
		    }
		    else if((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
		        System.out.println("Triangulo " + nome + " isosceles.");
		    }
		    else{
		        System.out.println("Triangulo " + nome + " escaleno.");
		    }
		    return;
}
	}
}
