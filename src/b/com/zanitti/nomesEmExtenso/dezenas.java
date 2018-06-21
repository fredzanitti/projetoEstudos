package b.com.zanitti.nomesEmExtenso;

public class dezenas {

	public static String dezena(int num){
		String ext = "";
		switch (num) {
		case 11:
			ext = "onze";
			break;
		case 12:
			ext = "doze";
			break;
		case 13:
			ext = "treze";
			break;
		case 14:
			ext = "quatorze";
			break;
		case 15:
			ext = "quinze";
			break;
		case 16:
			ext = "dezesseis";
			break;
		case 17:
			ext = "dezessete";
			break;
		case 18:
			ext = "dezoito";
			break;
		case 19:
			ext = "dezenove";
			break;
		}
		
		
		return ext;
	}
}
