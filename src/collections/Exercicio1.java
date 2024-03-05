package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);

		ArrayList<String> setcores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite " + (i + 1) + "ª cor: ");
			setcores.add(leia.next());

		}
		System.out.println("\nLista de todas as cores: ");
		setcores.forEach(System.out::println);

		Collections.sort(setcores);

		System.out.println("\n Ordenar as cores: ");
		setcores.forEach(System.out::println);

	}

}
