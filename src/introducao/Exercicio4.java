package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float num1;
		float num2;
		float num3;
		float num4;
		float calculo;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leia.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		num2 = leia.nextFloat();
		
		System.out.print("Digite o terceiro numero: ");
		num3 = leia.nextFloat();
		
		System.out.print("Digite o quarto numero: ");
		num4 = leia.nextFloat();
		
		
		leia.close();
		
		
		calculo =(num1 * num2) - (num3 * num4);
		
		System.out.print("A difeteça é: " +calculo);
		
		
	}

}
