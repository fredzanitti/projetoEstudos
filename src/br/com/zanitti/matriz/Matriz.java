package br.com.zanitti.matriz;

import java.text.DecimalFormat;
import br.com.zanitti.letras.Indices;

public class Matriz {

	private static final int TAM = 3;
	private int[][] matrizCod;

	public void setMatrizCod(StringBuilder sb) {

		int k = 0;
		matrizCod = new int[TAM][TAM];
		Indices in = new Indices();

		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				matrizCod[i][j] = in.getLetras(sb.substring(k, k + 1));
				k++;
			}
		}

	}

	public int[][] getMatrizCod() {
		return matrizCod;
	}

	public void imprimeMatriz(int[][] mat) {
		StringBuilder sb = new StringBuilder();
		DecimalFormat f = new DecimalFormat("00  ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sb.append(f.format(mat[i][j]));
			}
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
	}

	public int[][] codificaMatriz(int[][] mMessage) {
		int[][] mReult = new int[TAM][TAM];

		int[][] mChave = new int[TAM][TAM];
		mChave[0][0] = 1;
		mChave[0][1] = 0;
		mChave[0][2] = 1;
		mChave[1][0] = -1;
		mChave[1][1] = 3;
		mChave[1][2] = 1;
		mChave[2][0] = 0;
		mChave[2][1] = 1;
		mChave[2][2] = 1;

		for (int x = 0; x < mReult.length; x++) {
			for (int y = 0; y < mReult[x].length; y++) {
				for (int z = 0; z < mMessage[0].length; z++) {
					mReult[x][y] += mMessage[x][z] * mChave[z][y];
				}
			}
		}

		return mReult;

	}

}
