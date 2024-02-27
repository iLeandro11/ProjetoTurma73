package introducao;

import java.util.Scanner;

public class ExercicioComplementar1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		float A;
		float B;
		float soma;
		float diferenca;
		float multiplicacao;
		float divisao;
		
		System.out.print("Digite o primeiro valor: ");
		A = leia.nextFloat();
		
		System.out.print("Digite o segundo valor: ");
		B = leia.nextFloat();
		
		soma = A + B;
		System.out.println("Soma: " +soma);
		
		diferenca = A - B;
		System.out.println("Diferença: " +diferenca);
		
		multiplicacao = A * B;
		System.out.println("Multiplicação: " +multiplicacao);
		
		divisao = A / B;
		System.out.println("Divisão: " +divisao);
		
		leia.close();
		
		
	}

}
