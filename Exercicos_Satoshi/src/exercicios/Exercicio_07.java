package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba o valor de um dep�sito em poupan�a. 
 * Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m.
 */


public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double depo;
		double juros ; 
		double aposMes = 0 ;
		
		double a = Math.pow(1.3, 1);
		
		System.out.println("Digite o valor para ser depositado na poupan�a ");
		depo = scan.nextDouble();

		juros = depo * a ;
		
		aposMes = aposMes + juros;
		
		
		System.out.print("O valor atualizado � :"+aposMes);
		
		
		
		
	}

}
