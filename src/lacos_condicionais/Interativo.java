package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Digite um valor para X: ");
		x = leia.nextInt();
		
		System.out.print("Digite um valor para Y: ");
		y =leia.nextInt();
		
		if( x > y) {
			System.out.print(" X é maior do que Y");
		}
		
		else if ( x == y) {
			System.out.print(" Ambos são iguais");
			
		}
		
		else {
			System.out.print("\nY é maior que X");
		}
		
		leia.close();
	}

}
