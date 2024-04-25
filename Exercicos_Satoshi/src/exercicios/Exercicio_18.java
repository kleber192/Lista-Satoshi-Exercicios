package exercicios;

import java.util.Scanner;

/*
 * Receba 2 valores reais. Calcule e mostre o maior deles.
 * 
 */

public class Exercicio_18 {

	public static void main(String[] args) {
		
		
		    Scanner scan = new Scanner(System.in);
	        int valor1;
	        int valor2;
	        
	        
			System.out.println("Sistema de diferenças dos valores ! ");	
		
			System.out.println("Digite o primeiro valor : ");	
            valor1 = Integer.parseInt(scan.nextLine());
            
			System.out.println("Digite o segundo valor : ");
			valor2 = Integer.parseInt(scan.nextLine());
			
			
			if (valor1 > valor2) {
				
				System.out.println("O maior numero é "+ valor1);
				
			}else if (valor2 >valor1) {
				
				System.out.println(" maior numero é "+ valor2);
			}
			
			
			
	}

}
