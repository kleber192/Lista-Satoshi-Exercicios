package exercicios;

import java.util.Scanner;

/*
 *  Receba os valores de 2 catetos de um triângulo retângulo.
 *   Calcule e mostre a hipotenusa
 */

public class Exercicio_14 {

	public static void main(String[] args) {
		
		
	int valor1;
	int valor2;
	Scanner scan = new Scanner(System.in);	
		
	System.out.println(" Localizador de Hipotenuza ! ");
	
	System.out.println("Digite o valor do 1 cateto :");
	valor1 = Integer.parseInt(scan.nextLine());
	
	System.out.println("Digite o valor do 2 cateto :");
	valor2 = Integer.parseInt(scan.nextLine());
	
	
	int hip = valor1 + valor2;
	
		
	System.out.println("A hipotenusa é  :"+hip);

	}

}
