package vetor_matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Integer num;// 0 1 2 3 4 5 6 7 8 9
		int vetor[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
		int indice;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (indice = 0; indice < vetor.length; indice++) {
			System.out.print(vetor[indice] + " ");

			if (num == vetor[indice]) {
				System.out.println("\nO numero " + num + " está localizado na posição: " + indice);
				encontrado = true;
				break;
			}

		}
		if (!encontrado) {
			System.out.println("\nO numero " + num + " não foi encontrado!");

		}

	}
}
