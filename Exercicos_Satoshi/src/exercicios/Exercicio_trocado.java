package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */



public class Exercicio_trocado {

	public static void main(String[] args) {
	
		
		
		Scanner s = new Scanner(System.in);
		
		int base,altura,area;
		
		System.out.println("Digite a base do seu triangulo : ");
		base = Integer.parseInt(s.nextLine());
		
		System.out.println("Digite a altura do seu triangulo : ");
		altura = Integer.parseInt(s.nextLine());
		
		
		area = (base *  altura) / 2 ;
		
		
		System.out.println("A area do seu triangulo é : "+area);
		
		
		

	}

}
