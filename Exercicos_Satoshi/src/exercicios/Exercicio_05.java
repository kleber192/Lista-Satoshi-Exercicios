package exercicios;

import java.util.Scanner;

/*
 * 
 * 
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * 
 */



public class Exercicio_05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int a ,b,aux  ;
		
		
		System.out.println("Digite o primeiro valor X1: ");
		
		a = scan.nextInt();
		
		
	
		System.out.println("Digite o primeiro valor X2: ");
		
		b = scan.nextInt();
		
		System.out.println(" O primeiro digitado  é :"+a+" o segundo é "+b);
		
		
		aux = a;
		a = b ;
		b = aux ;
		
		
		System.out.println(" O primeiro numero é :"+a+" o segundo é "+b);
		
		
	
		 
		
		
		
		
		
		

	}

}
