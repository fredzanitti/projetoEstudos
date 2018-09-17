package br.com.zanitti.extenso;

import java.util.Scanner;

import b.com.zanitti.nomesEmExtenso.converteNumeros;

public class numeroPorExtenso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Quantidade de testes: ");
		int qtde = s.nextInt();

		for (int i = 0; i < qtde; i++) {
			System.out.println("");
			System.out.print("Digite um número inteiro: ");
			int num = s.nextInt();
			converteNumeros cv = new converteNumeros();
			cv.converterNumeros(num);
		}
		s.close();
	}

}
