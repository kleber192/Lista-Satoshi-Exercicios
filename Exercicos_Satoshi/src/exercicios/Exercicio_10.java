package exercicios;

import java.util.Scanner;

/*
 * Receba o raio de uma circunferência. 
 * Calcule e mostre o comprimento da circunferência.
 * 
 */

public class Exercicio_10 {

	public static void main(String args []) {
	Scanner scan = new Scanner(System.in);
	
	double raio ; 
	double comprimento;
	double resul;
	
	
	System.out.println("Digite o comprimento para calcular o raio do seu circulo !! : ");
	
	
	System.out.println("Digite o comprimento para calcular o raio : ");
	comprimento = Double.parseDouble(scan.nextLine());
	
	raio =  comprimento/ Math.PI ;
	
	
	System.out.println(" O raio é  : "+raio);
	}
	
}
