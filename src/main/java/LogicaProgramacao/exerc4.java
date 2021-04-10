package LogicaProgramacao;

import java.util.Scanner;

public class exerc4 {
	public void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double ipi, qtd1, qtd2, valor1, valor2, valorTotal;
		int cod1, cod2;

		System.out.printf("Qual o valor do IPI?");
		ipi = ler.nextDouble();

		System.out.printf("Digite o codigo do produto");
		cod1 = ler.nextInt();

		System.out.printf("Qual o valor do Produto?");
		valor1 = ler.nextDouble();

		System.out.printf("Qual a quantidade deste produto?");
		qtd1 = ler.nextDouble();

		System.out.printf("Digite o codigo do proximo produto");
		cod2 = ler.nextInt();

		System.out.printf("Qual o valor do produto?");
		valor2 = ler.nextDouble();

		System.out.printf("Qual a quantidade deste produto? ");
		qtd2 = ler.nextDouble();

		valorTotal = ((valor1 * qtd1) + (valor2 * qtd2)) * ((ipi / 100) + 1);

		System.out.printf("Os produtos " + cod1 + " e " + cod2 + " Tem valor total a ser pago de: %.2f", valorTotal);

	}

}
