package lista1;

import java.util.Scanner; 

public class caixa_eletronico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int saque = 0;
		int notas_100 = 0;
		int notas_50 = 0;
		int notas_10 = 0;
		int notas_5 = 0;
		int notas_1 = 0;
		
		System.out.println("Insira aqui a quantidade do saque: ");
		saque = entrada.nextInt();
		
		notas_100 = saque / 100;
		notas_50 = (saque % 100)/50;
		notas_10 = ((saque % 100) %50) / 10;
		notas_5 = (((saque % 100) % 50)% 10) /5;
		notas_1 = ((((saque % 100) % 50) % 10) % 5) / 1;
		
		System.out.println("Seu saque foi de:" + saque );
		System.out.println("Foi fornecido esta quantidade de notas de 100: " + notas_100);
		System.out.println("Foi fornecido esta quantidade de notas de 50: " + notas_50);
		System.out.println("Foi fornecido esta quantidade de notas de 10: " + notas_10 );
		System.out.println("Foi fornecido esta quantidade de notas de 5: " + notas_5);
		System.out.println("Foi fornecido esta quantidade de notas de 1: " + notas_1);
	
	}

}
