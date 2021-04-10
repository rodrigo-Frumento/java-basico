package LogicaProgramacao;

import java.util.Scanner;

public class exerc6 {

	public static void main(String argsp[]) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.printf("Digite um numero Inteiro (apenas numeros)");
		a = ler.nextInt();
		System.out.printf("Seu numero foi %d \n", a);
		System.out.printf("Seu sucessor e %d \n", a+1);
		System.out.printf("Seu antecessor e %d \n", a-1);
		
	}
}
