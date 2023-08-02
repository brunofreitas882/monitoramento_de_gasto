package Variaveis;

public class Operadores {

	public static void main(String[] args) {
		//Operador unário 01  ++ e --
		
		int preco = 10;
		System.out.println(preco++); //10
		System.out.println(++preco); //10 + 1 = 11
		System.out.println(preco--); // 11 + = 12
		System.out.println(--preco);
//------------------------------------------------------------------------
		//Operador Unário 02 (operações)
		int valor01 = 10;
		int valor02 = 10;
		int valor03 = 2;
		
		System.out.println("valor de valor03 É:" + valor03);
		System.out.println(valor01++ + ++valor01);
		System.out.println(valor02++ + valor01++);

	}

}
