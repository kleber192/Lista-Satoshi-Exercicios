package exercicios;

import java.util.Scanner;

/*
 * Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
 */

public class Exercicio_13 {

	public static void main(String[] args) {
		
		
		int angulo1;
		int angulo2;
		int angulo3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sistema para localizar os angulos do triangulo ! ");
		
		
		System.out.println("Digite o primero angulo : ");
		angulo1 = Integer.parseInt(scan.nextLine());
		
		
		
		System.out.println("Digite o segundo angulo : ");
		angulo2 = Integer.parseInt(scan.nextLine());
		
		
		
		
		angulo3 = 180 - (angulo1 + angulo2); 
		
		
		System.out.println("O terceiro angulo � : "+angulo3);

	}

}
