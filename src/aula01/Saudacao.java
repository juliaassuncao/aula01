package aula01;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Por favor, insira seu nome: ");
		nome = teclado.next();
		System.out.println("O nome digitado foi " + nome);
		
		teclado.close();
	}

}
