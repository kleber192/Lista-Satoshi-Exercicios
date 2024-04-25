package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */


public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double sal,salA;
		
		
		System.out.println("Digite o valor do seu salario : ");
		sal = Double.parseDouble(scan.nextLine());
		
		
		salA = sal * 1.15;
		
		
		
		System.out.println(" O salario com 15% de aumento ficou  "+salA);
		
		
		
		

	}

}
