package LogicaProgramacao;

import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, dia, mes;
		
		System.out.printf(" Informe o ano de nascimento: ");
		ano = ler.nextInt();
		
		System.out.printf("Informe o mes de nascimento: ");
		mes = ler.nextInt();

		System.out.printf("Informe o dia de nascimento: ");
		dia = ler.nextInt();
		
		System.out.printf("Seu nascimento em dias e: %d dias", (ano*365)+(mes*30)+(dia));
	}
}
