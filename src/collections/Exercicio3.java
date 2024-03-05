package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite " + (i + 1) + "º numero: ");
			numeros.add(leia.nextInt());
		}

		System.out.println(" Set " + numeros);

		Iterator<Integer> iterator = numeros.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
