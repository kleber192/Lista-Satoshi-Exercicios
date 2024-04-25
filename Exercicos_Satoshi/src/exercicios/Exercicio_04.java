package exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		
		   int a,b,c  ;
		   double  delta,x1,x2;
			
			
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Digite o valor de A : ");
			a = Integer.parseInt(scan.nextLine());
			
			
			System.out.println("Digite o valor de B : ");
			b = Integer.parseInt(scan.nextLine());
			
			
			System.out.println("Digite o valor de C : ");
			c = Integer.parseInt(scan.nextLine());
			
			
			delta = Math.pow(b, 2) - 4 * a * c; 
			
			
			
			if (delta >= 0 ) {
				
				
				x1 = (-b + delta) / (2*a) ; 
				System.out.println("Resposta X1 :"+x1);
				
				
			}
			 
			  
			  if(delta <= 0) {
			  
			    x2 = (-b - delta) / (2*a) ; 
			    System.out.println("Resposta X2 :"+x2);
			
			  }
		
		}
		
		
		
		

	}

 
