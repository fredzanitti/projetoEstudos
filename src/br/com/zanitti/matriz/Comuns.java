package br.com.zanitti.matriz;

import java.util.Scanner;

public class Comuns {
	
	/**
	 * Retorna mensagem com at� 9 caracteres
	 * @param s 	= vari�vel de leitura Scanner
	 * @param msg	= mesagem que ser� verificada
	 * @return		= mensagem qeu ser� retornada em mai�sculo
	 */
	public String DigitarCodigo(Scanner s, String msg) {
		String compl = null;
		System.out.print("Infomre a mensagem a ser codificada (at� 9 caracteres): ");
		msg = s.nextLine();
		
		while (msg.length() > 9) {
			System.out.print("C�digo com mais de 9 caracteres, digite novamente: ");
			msg = s.nextLine();	
		}
		
		if (msg.length() < 9) {
			int tam = 9 - msg.length();
			for (int i = 0; i < tam; i++) {
				compl = compl + " ";
			}
		}
		
		return msg.toUpperCase() + compl;
	}
}
