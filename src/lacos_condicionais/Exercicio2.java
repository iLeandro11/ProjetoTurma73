package lacos_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.print("O Número " + numero + " é par e positivo!");
		}
		else if (numero % 2 == 0 && numero < 0) {
			System.out.print("O Número " + numero + " é par e negativo!");
		}
		else if (numero % 2 == 1 && numero >= 0) {
			System.out.print("O Número " + numero + " é impar e positivo!");
		}
		else {
			System.out.print("O Número " + numero + " é impar e negativo!");
		}
		leia.close();

	}

}
