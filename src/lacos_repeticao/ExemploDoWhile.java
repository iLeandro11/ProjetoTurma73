package lacos_repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		int numero, resultado, contador = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();

			resultado = numero * 5;
			
			contador++;

			System.out.println("\nO resultado da multiplicação é: " + resultado);

		} while (contador <= 2);
	}

}
