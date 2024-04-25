package exercicios;

import java.util.Scanner;

/*
 * Receba a temperatura em graus Celsius.
 * Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * 
 */
public class Exercicio_03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int cels;
		int fah;
		
		
		System.out.println("Digite os graus celcius Cº");
		cels = Integer.parseInt(scan.nextLine());
		
		
		
		
		fah = (9*cels+160) / 5 ;
		
		System.out.println("Os graus convertidos em Fahrenhait Fº é : "+fah);
		
		
		

	}

}
