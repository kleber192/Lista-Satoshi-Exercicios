package exercicios;

import java.util.Scanner;

/*
 * 
 * Calcule a quantidade de litros gastos em uma viagem, 
 * sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */


public class Exercicio_16 {

	public static void main(String[] args) {
		
		
		double litro ;
		int tempo;
		int velMedia;
        Scanner scan = new Scanner(System.in);
        
        
		System.out.println("Sistema de calculo de Litros gastos ! ");
		
		System.out.println("Digite o tempo do percurso :  ");
		tempo = Integer.parseInt(scan.nextLine());

		System.out.println("Digite a velocidade media :  ");
		velMedia = Integer.parseInt(scan.nextLine());
		
		
		litro = (tempo * velMedia) / 12 ; 
		
		System.out.println("o total gasto foi  :"+litro);
	}

}
