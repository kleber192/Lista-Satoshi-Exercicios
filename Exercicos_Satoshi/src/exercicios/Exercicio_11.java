package exercicios;

import java.util.Scanner;

/*
 * 11 - Receba o ano de nascimento e o ano atual. 
 * Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */
public class Exercicio_11 {

	public static void main(String[] args) {
		

		Scanner scan  = new Scanner (System.in);
		
		
		int anoNasc;
		int anoAtual;
		int anores;
		
		
		System.out.println("Sistema para calcular idade futura!!");
		
		System.out.println("Digite o ano que nasceu : ");
		anoNasc = Integer.parseInt(scan.nextLine());
		

		System.out.println("Digite ano atual : ");
		anoAtual= Integer.parseInt(scan.nextLine());
		
		
		
		anores = anoAtual - anoNasc ; 
		int anofuturo = anores + 17 ;
		
		
		System.out.println("Sua idade é  : "+anores);
		System.out.println("Sua idade futura é  : "+anofuturo);
		
	}

}
