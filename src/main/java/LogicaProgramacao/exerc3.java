package LogicaProgramacao;

import java.util.Scanner;

public class exerc3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double saldo;
		double percentual = 1.0/100.0;
		
		System.out.printf("Digite seu Saldo: R$ ");
		saldo = ler.nextDouble();
		
		saldo = (saldo * percentual) + saldo;
		
		System.out.printf("Seu saldo reajustado e: R$ %.2f", saldo);
		
	}
}