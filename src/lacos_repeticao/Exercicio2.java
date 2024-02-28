package lacos_repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		int idade = 0, menor21 = 0, maior50 = 0 ;
		
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >=0 ) {
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		if(idade < 21  ) {
			menor21++;
		}
		else if(idade > 50) {
			maior50++;
		}
			
		
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + (menor21 -1) );
		System.out.println("Total de pessoas com mais de 50 anos: " + maior50);
		
	}

}
