package lacos_condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int A, B, C;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número A: ");
		A = leia.nextInt();

		System.out.print("Digite o número B: ");
		B = leia.nextInt();

		System.out.print("Digite o número C: ");
		C = leia.nextInt();

		if (A + B > C) {
			System.out.print("A Soma do A + B é Maior do que C ");
		}
		else if (A + B < C) {
			System.out.print("A Soma do A + B é Menor do que C ");
		}
		else {
			System.out.print("A Soma do A + B é igual a C ");
		}

		leia.close();
	}

}
