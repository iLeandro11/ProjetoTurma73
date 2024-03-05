package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {

		Set<Integer> numero = new HashSet<Integer>();

		int numdigitado;
		boolean condicao = false;

		Scanner leia = new Scanner(System.in);

		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		numdigitado = leia.nextInt();

		for (int i = 0; i < numero.size(); i++) {
			if (numero.contains(numdigitado)) {
				condicao = true;
				System.out.println("O Número " + numdigitado + " foi encontrado");

				break;
			}
		}
		if (!condicao) {
			System.out.println("O numero " + numdigitado + " não foi encontrado!");

		}

	}

}
