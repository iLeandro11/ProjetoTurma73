package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novosalario;
		
		 Scanner leia = new Scanner(System.in);

		  System.out.print("Digite o Salário: ");
		   salario = leia.nextFloat();
		 
		  System.out.print("Digite seu Abono: ");
		  abono = leia.nextFloat();
		  
		  
		  leia.close();
		  
		  
		  novosalario = salario + abono;
		 
		  System.out.println("Seu novo salário é: " +novosalario);
		 
		 
	}

}
