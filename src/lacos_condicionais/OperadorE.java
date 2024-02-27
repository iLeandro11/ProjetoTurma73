package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
//		int idade;
//		boolean carteiraM;
//	
//		Scanner leia = new Scanner(System.in);
//		
//		System.out.print("Digite sua idade: ");
//		idade = leia.nextInt();
//		
//		System.out.print("Você tem carteira de habilitação? (true/false)");
//		carteiraM = leia.nextBoolean();
//		
//		if( idade >= 18 && carteiraM == true) {
//			System.out.println("\nVocê pode dirigir!");
//		
//		}
//		
//		else {
//			System.out.println("\nVocê não pode dirigir!");	
//		}

		
		// else if (idade >= 10 carteuM ==false)
		// else if ( idade < 18 && carteiraM == true)	
		// não é necessário, porque o else ja satisfaz estas condições
		
		
		// ------------EXEMPLO 2-------------
		
		
		
		//meida para passar de ano é 6
		//entre 5 é exame
		// menor que 5 reprovado
		
		
		float nota1, nota2, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >=6 ) {
			System.out.println("Parabens ,Aprovade!");
			
		}
		
		else if( media >= 5) {
			System.out.println("Está de exame!");
		}
		
		else {
			System.out.println("Está de recuperação!");
		}
		
		// ao ser satisfeito na primeira linha ele não lê o resto
		

		leia.close();


	}
	

}
