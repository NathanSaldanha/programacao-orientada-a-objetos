class Principal{
	public static void main(String[] args) {
		
		Casa c1 = new Casa();

		c1.cor = "Vermelho";
		c1.porta1= c1.fecha(c1.porta1);
		c1.porta2= c1.fecha(c1.porta2);
		c1.porta3= c1.abre(c1.porta3);
		c1.pinta("Preto");
		c1.quantasPortasEstaoAbertas();
	}
}