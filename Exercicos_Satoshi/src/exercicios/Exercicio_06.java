package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba os valores do comprimento, largura e altura de um paralelepípedo.
 *  Calcule e mostre seu volume.
 * 
 */


public class Exercicio_06 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		int comprimento, largura ,altura ,paralelepípedo;
		
		
		
		System.out.println("Digite o valor do comprimento : ");
		comprimento = Integer.parseInt(s.nextLine());
		
		
		System.out.println("Digite o valor da altura : ");
		altura = Integer.parseInt(s.nextLine());
		
		
		System.out.println("Digite o valor da altura  : ");
		largura = Integer.parseInt(s.nextLine());
		
		
		paralelepípedo = comprimento * altura * largura ;
		
		
		System.out.println("A area do paralelepipedo é :"+paralelepípedo);
		
		
	
		
		

	}

}
