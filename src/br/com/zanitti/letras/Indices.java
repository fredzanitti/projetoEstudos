package br.com.zanitti.letras;

public class Indices {
	private String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

	/**
	 * Retornar o código referente a letra informada
	 * @param s = uma letra a ser convertida em código
	 * @return  = o código refernte a letra passada como parametro
	 */
	public int getLetras(String s) {
		int indice = 0;
		for (int i = 0; i < letras.length; i++) {
			if (s.equals(letras[i])) {
				indice = i + 1;
				return indice;
			} else {
				indice = 0;
			}
		}
		return indice;	
	}
}
