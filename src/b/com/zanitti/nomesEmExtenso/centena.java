package b.com.zanitti.nomesEmExtenso;

public class centena {

	public static String centenas(int num){
		String ext = "";
		switch (num) {
		case 100:
			ext = "cento";
			break;
		case 200:
			ext = "duzentos";
			break;
		case 300:
			ext = "trezentos";
			break;
		case 400:
			ext = "quatrocentos";
			break;
		case 500:
			ext = "quinhentos";
			break;
		case 600:
			ext = "seissentos";
			break;
		case 700:
			ext = "setecentos";
			break;
		case 800:
			ext = "oitocentos";
			break;
		case 900:
			ext = "novecentos";
			break;
		}
		
		
		return ext;
	}
}
