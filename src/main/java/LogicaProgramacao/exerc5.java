package LogicaProgramacao;

import java.util.Scanner;

public class exerc5 {
	
	Scanner ler = new Scanner(System.in);
	
	public void formulario (double sm, double qtdS, double res) {
		sm = 788.00;
		System.out.printf("Qual o seu salario?");
		qtdS = ler.nextDouble();
		res = qtdS/sm;
		System.out.print(res);
	}	
}