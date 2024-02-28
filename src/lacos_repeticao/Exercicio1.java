package lacos_repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo inválido!");	
		}
		
		System.out.println("Multiplos de 3 e 5 no intervalo entre " + num1 +" e "  + num2 + ": ");
		
		for( ; num1 <= num2; num1++ ) {
			if ( num1% 3 == 0 &&  num1% 5 == 0) {
				System.out.println( num1+" Múltiplo de 3 e 5 ");
			}
			
		}
	
	}

}
