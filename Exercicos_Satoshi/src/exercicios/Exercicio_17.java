package exercicios;

import java.util.Scanner;

/*
 * Receba 2 valores inteiros.
 *  Calcule e mostre o resultado da diferen�a do maior pelo menos valor.
 */

public class Exercicio_17 {

	public static void main(String[] args) {
		

        Scanner scan = new Scanner(System.in);
        int valor1;
        int valor2;
        int dir ;
        
		System.out.println("Sistema de diferen�as dos valores ! ");
	
		System.out.println("Digite o valor 1 ");
		valor1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Digite o valor 2 ");
		valor2 = Integer.parseInt(scan.nextLine());
		
		if (valor1 > valor2) {
			
			dir = valor1 - valor2;
			System.out.println(" a diferen�a do "+valor1+ " e "+valor2+" � "+dir);
			
		}else if (valor2>valor1) {
			
			dir = valor2 - valor1;
			System.out.println(" a diferen�a do "+valor2+ " e "+valor1+" � "+dir);
		}
		
		
	}

}
