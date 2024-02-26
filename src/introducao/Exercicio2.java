package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
	
		
		System.out.print("Informe a Primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Informe a Segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Informe a Terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Informe a Quarta nota: ");
		nota4 = leia.nextFloat();
		
		
		leia.close();
		
		
		media = (nota1+ nota2 + nota3 +nota4)/4;
		
		// %.1f tirar as casas da vírgula
		System.out.printf("A media final é:  " + media);
		
		
		
		


		
		
		
	}

}
