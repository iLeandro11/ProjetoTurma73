package lacos_condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		int codigo, quantidade;
		float valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Código: ");
		codigo = leia.nextInt();
		
		System.out.print("Digite a Qunatidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
	      case 1:
	        System.out.printf("Produto: Cachorro Quente");
	        valor = (float) 10.00;
	        System.out.printf("Valor total: R$ %.2f" ,valor * quantidade);
	         break;
	        
	      case 2:
	        System.out.println("X-Salada");
	        valor = (float) 15.00;
	        System.out.printf("Valor total: R$ " , (valor * quantidade));
	        break;
	        
	      case 3:
	        System.out.println("X-Bacon");
	        valor = (float) 18.00;
	        System.out.printf("Valor total: R$ %.2f ", valor * quantidade);
	        break;
	        
	      case 4:
	        System.out.println("Bauru");
	        valor = (float) 18.00;
	        System.out.printf("Valor total: R$ %.2f" ,(valor * quantidade));
	        break;
	        
	      case 5:
	        System.out.println("Refrigerante");
	        valor = (float) 8.00;
	        System.out.printf("Valor total: R$" ,(valor * quantidade));
	        break;
	        
	      case 6:
	        System.out.println("Suco de Laranja");
	        valor = (float) 13.00;
	        System.out.printf("Valor total: R$ " ,(valor * quantidade));
	        break;
	      default: 
	    	  System.out.print("Operação Inválida");
	    }
			leia.close();
		
		

	}

}
