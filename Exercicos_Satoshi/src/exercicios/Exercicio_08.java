package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * 
 */

public class Exercicio_08 {

	public static void main(String[] args) {
		
		
     Scanner scan = new Scanner(System.in);		
		
		int a ;
		int b ;
		
		
		System.out.println("Digite o valor de A : ");
		a = Integer.parseInt(scan.nextLine());
		
		System.out.println("Digite o valor de b : ");
		b = Integer.parseInt(scan.nextLine());
		
		
		double res = Math.pow(a, 2) + Math.pow(b, 2);
		
		
		System.out.println("O resultado da soma é : "+res);
		
		
		
		
		
		
		
		
		
	}

}
