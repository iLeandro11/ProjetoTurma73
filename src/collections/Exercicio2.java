package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numeroDigitado;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println(numeros);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		if (numeros.contains(numeroDigitado)) {
			System.out.println("O número " +numeroDigitado +  " está localizado na posição: " +numeros.indexOf(numeroDigitado));
		}
		else {
			System.out.println("O número " +numeroDigitado + " não foi encontrado!");
		}
	}

}
