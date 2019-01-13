class Porta{
	boolean aberta;
	String cor;
	double dimensaox;
	double dimensaoy;
	double dimensaoz;

	
	void pinta(String s){
		this.cor= s;
	}
	boolean aberta(boolean num){
		if (num==true) {
			System.out.println("Porta aberta");
			return true;
		}
		else{
			System.out.println("Porta fechada");
			return false;
		}

	}
	void imprimir(){
		System.out.println(cor);
		System.out.println(dimensaox);
		System.out.println(dimensaoy);
		System.out.println(dimensaoz);
	}
}