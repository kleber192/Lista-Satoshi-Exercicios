package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba o valor de um depósito em poupança. 
 * Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */


public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double depo;
		double juros ; 
		double aposMes = 0 ;
		
		double a = Math.pow(1.3, 1);
		
		System.out.println("Digite o valor para ser depositado na poupança ");
		depo = scan.nextDouble();

		juros = depo * a ;
		
		aposMes = aposMes + juros;
		
		
		System.out.print("O valor atualizado é :"+aposMes);
		
		
		
		
	}

}
