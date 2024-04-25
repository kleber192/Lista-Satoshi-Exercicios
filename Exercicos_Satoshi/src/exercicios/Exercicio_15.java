package exercicios;

import java.util.Scanner;

/*
 * 
 * Receba a quantidade de horas trabalhadas, o valor por hora,
 * o percentual de desconto e o número de descendentes.
 *   Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
 *  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 */
public class Exercicio_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		 int horas_Trabalhadas; 
		 double valorhora;
		 int perDesconto ;
		 int descendentes ; 
		 double salLiq ;
		 double salFim;
		 double descontoFim ; 
		 int varDesc;
		 
		 
		 System.out.println("Sistema de calculo salarial : ");
		 
		 System.out.println("Digite a hora trabalhada : ");
		 horas_Trabalhadas = Integer.parseInt(scan.nextLine());
		 
		 System.out.println("Digite a quantos dias trabalhados : ");
		 valorhora = Double.parseDouble(scan.nextLine());
		 
		 
		 System.out.println("Digite a porcentagem de desconto  : ");
		 perDesconto = Integer.parseInt(scan.nextLine());
		 
		 System.out.println("Digite o numero de descendente  : ");
		 descendentes = Integer.parseInt(scan.nextLine());
		 
		 
		 salLiq = horas_Trabalhadas * valorhora;
		 
	     varDesc = descendentes * 100 ;	 
	     
	     descontoFim = ((salLiq * perDesconto) / 100 );	 
		 
		 salFim = (salLiq + varDesc) - descontoFim ; 
		 
		 
		 
		 System.out.println("O salario base é : "+salLiq);
		 
		 System.out.println("O desconto foi : "+descontoFim);
		 
		 System.out.println("A quantidade de denpedente é  : "+descendentes+" foi acrescentado então :"+varDesc);
		 
		 System.out.println("O salario final é : "+salFim);
		 
		 
		 
	}

}
