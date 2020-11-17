package lista1;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class tabajara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double salario = 0;
		double salario_novo = 0;
		int porcentagem = 0;
		
		System.out.println("Bem vindo colaborador Tabajara");
		System.out.println("Informe seu salário: ");
		salario = entrada.nextDouble();

		if (salario <= 280) {
			salario_novo = salario * 1.20;
			porcentagem = 20; }
		else if (280 < salario <= 700) {
			salario_novo = salario * 1.15;
			porcentagem = 15; }
		else if (700 < salario <= 1500) {
			salario_novo = salario * 1.10;
			porcentagem = 10; }
		else { 
			salario_novo = salario * 1.05;
			porcentagem = 5; 
		}
		
		System.out.println("Seu novo salário é: "+ salario_novo);
		System.out.println("O aumento foi de: "+ (salario_novo - salario));
		System.out.println("O aumento porcentual foi de:" + porcentagem);
		
	}

}
