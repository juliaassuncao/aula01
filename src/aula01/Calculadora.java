package aula01;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;

		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir os valores que voc� digitar!");
		System.out.println("Digite o primeiro valor que deseja somar: ");
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor que deseja somar: ");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;	
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;
		
		System.out.println("A soma entre os dois valores foi de: " + soma);
		System.out.println("A subtra��o entre os dois valores foi de: " + subtracao);
		System.out.println("A multiplica��o entre os dois valores foi de: " + multiplicacao);
		System.out.println("A divis�o entre os dois valores foi de: " + divisao);

		leitor.close();
	}
}
