package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */

public class Exercicio_09 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);		
		
		double a ;
		double b ;
		double res ;
		
		System.out.println("Digite o valor A para : ");
		a = Integer.parseInt(scan.nextLine());
		
		
		
		System.out.println("Digite o valor A para : ");
		b = Integer.parseInt(scan.nextLine());
		
		
      if (a>b) {
    	  
    	  
    	  res  = a - b ;  
    	  System.out.println("A diferença é : "+res);
    	  
      }else if (b > a ) {
    	  
    	  res  = b - a ; 
    	  
    	  System.out.println("A diferença é : "+res);
    	  
      }		
		
		
		

	}

}
