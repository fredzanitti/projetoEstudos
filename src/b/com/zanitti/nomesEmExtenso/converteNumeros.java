package b.com.zanitti.nomesEmExtenso;

public class converteNumeros {

	public void converterNumeros(int num) {
		System.out.println(converterBilhoes(num));
	}

	private String converterBilhoes(int num) {
		String nome = "";
		if (num > 999999999) {
			if (num == 1000000000) {
				nome = "um bilhão";
			} else {
				int numCent = num % 1000000000;
				int numMil = num - (num % 1000000000);

				if (numMil == 1000000000) {
					nome = "um bilhão e " + converterMilhoes(numCent);
				} else {
					if (numCent == 0) {
						nome = converterMilhoes(numMil / 1000000000) + " bilhões";
					} else {
						if ((numCent < 100) || ((numCent % 1000000000) == 0)) {
							nome = converterMilhoes(numMil / 1000000000) + " bilhões e "
									+ converterMilhoes(numCent);
						} else {
							nome = converterMilhoes(numMil / 1000000000) + " bilhões, "
									+ converterMilhoes(numCent);							
						}
					}
				}
			}
		} else {
			nome = converterMilhoes(num);
		}

		return nome.toUpperCase();
	}	

	private String converterMilhoes(int num) {
		String nome = "";
		if (num > 999999) {
			if (num == 1000000) {
				nome = "um milhão";
			} else {
				int numCent = num % 1000000;
				int numMil = num - (num % 1000000);

				if (numMil == 1000000) {
					nome = "um milhão e " + converterMilhar(numCent);
				} else {
					if (numCent == 0) {
						nome = converterMilhar(numMil / 1000000) + " milhões";
					} else {
						if ((numCent < 100) || ((numCent % 1000000) == 0)) {
							nome = converterMilhar(numMil / 1000000) + " milhões e "
									+ converterMilhar(numCent);
						} else {
							nome = converterMilhar(numMil / 1000000) + " milhões, "
									+ converterMilhar(numCent);							
						}
					}
				}
			}
		} else {
			nome = converterMilhar(num);
		}

		return nome.toUpperCase();
	}	
	
	private String converterMilhar(int num) {
		String nome = "";
		if (num > 999) {
			if (num == 1000) {
				nome = "mil";
			} else {
				int numCent = num % 1000;
				int numMil = num - (num % 1000);

				if (numMil == 1000) {
					nome = "mil e " + converterCentDezUni(numCent);
				} else {
					if (numCent == 0) {
						nome = converterCentDezUni(numMil / 1000) + " mil";
					} else {
						if ((numCent < 100) || ((numCent % 100) == 0)) {
							nome = converterCentDezUni(numMil / 1000) + " mil e "
									+ converterCentDezUni(numCent);
						} else {
							nome = converterCentDezUni(numMil / 1000) + " mil, "
									+ converterCentDezUni(numCent);							
						}
					}
				}
			}
		} else {
			nome = converterCentDezUni(num);
		}

		return nome.toUpperCase();
	}

	private String converterCentDezUni(int num) {

		String nome = "";

		if (num == 100) {
			nome = "cem";
			return nome;
		}
		
		if (num == 0) {
			nome = "zero";
			return nome;
		}

		if (num < 10) { // unidades
			nome = unidades.unidade(num);
		} else { // dezenas inteiras (50,60,70, etc)
			if (num < 100) {
				if ((num % 10) == 0) {
					nome = dezenasInteiras.dezenaInt(num);
				} else { // dezenas entre 11 e 19
					if (num < 20) {
						nome = dezenas.dezena(num);
					} else {
						int numUnid = num % 10;
						int numDez = num - numUnid;
						nome = dezenasInteiras.dezenaInt(numDez) + " e " + unidades.unidade(numUnid);
					}
				}
			}
		}

		if (num > 99) {
			if ((num % 100) == 0) {
				nome = centena.centenas(num);
			} else {
				if ((num % 100) < 10) {
					int numUnid = num % 100;
					int numCent = num - numUnid;
					nome = centena.centenas(numCent) + " e " + unidades.unidade(numUnid);
				} else {
					if ((num % 100) < 20) {
						int numUnid = num % 100;
						int numCent = num - numUnid;

						if (numUnid == 10) {
							nome = centena.centenas(numCent) + " e " + dezenasInteiras.dezenaInt(numUnid);
						} else {
							nome = centena.centenas(numCent) + " e " + dezenas.dezena(numUnid);
						}
					} else {
						int numUnid = (num % 100) % 10;
						int numDez = (num % 100) - numUnid;
						int numCent = num - numDez - numUnid;
						if (numUnid == 0) {
							nome = centena.centenas(numCent) + " e " + dezenasInteiras.dezenaInt(numDez);
						} else {
							nome = centena.centenas(numCent) + " e " + dezenasInteiras.dezenaInt(numDez) + " e "
									+ unidades.unidade(numUnid);
						}
					}
				}
			}
		}
		return nome;

	}

}
