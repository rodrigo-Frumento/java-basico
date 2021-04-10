package LogicaProgramacao;

import java.util.Scanner;

public class exerc5 {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double sm, res, qtdS;
		sm = 788.00;
		System.out.printf("Qual o seu salario?");
		qtdS = ler.nextDouble();
		res = qtdS/sm;
		System.out.print("Você recebe um total de " + res + " SMs");
	}	
}