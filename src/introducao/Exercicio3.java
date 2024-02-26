package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salariobruto;
		float adicionalnoturno;
		float horasextras;
		float descontos;
		float salarioliquido;
		
		System.out.print("Digite seu salário bruto: ");
		salariobruto = leia.nextFloat();
		
		System.out.print("Digite seu adicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.print("Digite o valor das horas extras: ");
		horasextras = leia.nextFloat();
		
		System.out.print("Digite os descontos do seu salário: ");
		descontos = leia.nextFloat();
		
		
		leia.close();
		
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras * 5) - descontos;
		
		System.out.print("Seu salário liquido é: " +salarioliquido);
		
		

	}

}
