package br.com.zanitti.extenso;

import java.util.Scanner;

import b.com.zanitti.nomesEmExtenso.converteNumeros;

public class numeroPorExtenso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.print("Digite um número: ");
		int num = s.nextInt();
		
		converteNumeros cv = new converteNumeros();
		cv.converter(num);
		s.close();
	}

}
