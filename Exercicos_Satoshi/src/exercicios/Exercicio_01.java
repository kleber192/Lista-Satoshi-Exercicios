/*
 * 
 * Coletar o valor do lado de um quadrado, calcular sua área e
 * apresentar o resultado.
 */




package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		
		
	    int ladoA,res;
		
	    
	    System.out.println("Digite o lado do quadrado solicitado ");
		ladoA = Integer.parseInt(scan.nextLine());
		
		res = ladoA * ladoA;
		
		System.out.println(" O valor da area do quadrado é : "+res);
		
		
		
	}

}
