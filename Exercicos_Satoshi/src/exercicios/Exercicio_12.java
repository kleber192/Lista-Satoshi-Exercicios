package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba a quantidade de alimento em quilos. 
 * Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */

public class Exercicio_12 {

	public static void main(String[] args) {
		
		
		Scanner scan  = new Scanner(System.in);
		int qtd_Alimentos;
		int  consumoTotal ;
		

		
		System.out.println("Sistema para calculo de de alimentos : ");
		
		System.out.println("Digite a quantidade de alimento em quilos : ");
		qtd_Alimentos = Integer.parseInt(scan.nextLine());
		
		
		qtd_Alimentos = qtd_Alimentos * 1000 ;
		
		
		consumoTotal = (int) ( qtd_Alimentos / 0.50);
		
		
		
		System.out.println("Quantidade de que vai durar é : "+consumoTotal+" dias ");
		
		
	}

}
