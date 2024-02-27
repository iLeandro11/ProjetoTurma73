package lacos_condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int cargo;
		String nome;
		float salario;

		Scanner leia = new Scanner(System.in);

		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();

		System.out.print("Cargo: ");
		cargo = leia.nextInt();

		System.out.print("Salário: ");
		salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salario: R$ %.2f", salario * 1.10);
			break;
		case 2:
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo Vendedor");
			System.out.printf("Salario: R$ %.2f", salario * 1.07);
		case 3:
			System.out.println("Nome do Colaborador: " +nome);
			System.out.println("Cargo Supervisor");
			System.out.printf("Salario: R$ %.2f", salario * 1.09);
			break;
		case 4:
			System.out.println("Nome do Colaborador: " +nome);
			System.out.println("Cargo Motorista");
			System.out.printf("Salario: R$ %.2f", salario *1.06);
			break;
		case 5:
			System.out.println("Nome do Colaborador: " +nome);
			System.out.println("Cargo Estoquista");
			System.out.printf("Salario: R$ %.2f", salario *1.05);
			break;
		case 6:
			System.out.println("Nome do Colaborador: " +nome);
			System.out.println("Cargo Técnico de TI");
			System.out.printf("Salario: R$ %.2f", salario *1.08);
			break;	
		default: 
	    	  System.out.print("Operação Inválida");
		}
		
		leia.close();

	}
}
