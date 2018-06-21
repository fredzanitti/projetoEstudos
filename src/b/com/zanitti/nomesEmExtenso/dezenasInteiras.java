package b.com.zanitti.nomesEmExtenso;

public class dezenasInteiras {

	public static String dezenaInt(int num){
		String ext = "";
		switch (num) {
		case 10:
			ext = "dez";
			break;
		case 20:
			ext = "vinte";
			break;
		case 30:
			ext = "trinta";
			break;
		case 40:
			ext = "quarenta";
			break;
		case 50:
			ext = "cinquenta";
			break;
		case 60:
			ext = "sessenta";
			break;
		case 70:
			ext = "setenta";
			break;
		case 80:
			ext = "oitenta";
			break;
		case 90:
			ext = "noventa";
			break;
		}
		
		
		return ext;
	}
}
