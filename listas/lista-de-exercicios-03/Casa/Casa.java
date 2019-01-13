class Casa{
	String cor;
	int porta1;
	int porta2;
	int porta3;

	void pinta(String s){
		this.cor = s;
		System.out.println(cor);
	}
	int abre(int x){
		return 1;
	}
	int fecha(int y){
		return 0;
	}
	void quantasPortasEstaoAbertas(){
		int total = porta1+porta2+porta3;
		if (total>=1) {
			System.out.println("Quantidades de portas abertas: " + total);
		}
		else{
			System.out.println("Todas as portas estao fechadas");
		}
	}

}