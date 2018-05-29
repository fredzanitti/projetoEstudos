package br.com.zanitti.matriz;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		String msg = null;
		
		Comuns c = new Comuns();
		msg = c.DigitarCodigo(s, msg);
		
		StringBuilder sb = new StringBuilder();
		sb.append(msg);
		
		Matriz m = new Matriz();
		m.setMatrizCod(sb);	
		m.imprimeMatriz(m.codificaMatriz(m.getMatrizCod()));
		
		s.close();
	}


}
