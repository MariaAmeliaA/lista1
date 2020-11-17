package lista1;

import java.util.Scanner;

public class peso_ideal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String sexo = " ";
		double altura = 0; 
		double peso = 0;
		double mmc = 0;

		System.out.println("Informe seu sexo (masculino/feminino): ");
		sexo = entrada.nextLine().toString() ;
		
		System.out.println("Informe sua altura: ");
		altura = entrada.nextDouble();
		
		System.out.println("Informe seu peso: ");
		peso = entrada.nextDouble();
		
		if (sexo.toLowerCase().equals("feminino"))
			mmc = ((62.1 *altura)- 44.7);
		else if (sexo.toLowerCase().equals("masculino"))
			mmc = ((72.7 * altura) - 58);
		else 
			System.out.println("Informe corretamente o sexo (masculino/feminino)");
			
		System.out.println("Sua altura é:" + altura);
		System.out.println("Seu peso é:" + peso);
		System.out.println("O peso ideal para você seria:" + mmc);
		
		if (mmc > peso)
			System.out.println("Seu peso esta a baixo do peso ideal, cuidado");
		else if (mmc < peso)
			System.out.println("Seu peso esta a cima do peso ideal, cuidado");
		else
			System.out.println("Seu peso esta ideal");
	}

}
