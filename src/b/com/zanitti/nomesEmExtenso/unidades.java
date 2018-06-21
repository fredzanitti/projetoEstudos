package b.com.zanitti.nomesEmExtenso;

public class unidades {
	
	public static String unidade(int num){
		String ext = "";
		switch (num) {
		case 1:
			ext = "um";
			break;
		case 2:
			ext = "dois";
			break;
		case 3:
			ext = "três";
			break;
		case 4:
			ext = "quatro";
			break;
		case 5:
			ext = "cinco";
			break;
		case 6:
			ext = "seis";
			break;
		case 7:
			ext = "sete";
			break;
		case 8:
			ext = "oito";
			break;
		case 9:
			ext = "nove";
			break;
		}
		
		
		return ext;
	}
}
