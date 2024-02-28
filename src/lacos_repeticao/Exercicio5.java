package lacos_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um Número: ");
			num = leia.nextInt();
			
			if( num > 0) {
				soma += num;	
			}
		}
		// != diferente 
		while(num != 0);
		
		System.out.println("A soma dos números positivos digitados é: " +soma);
			
	}

}
