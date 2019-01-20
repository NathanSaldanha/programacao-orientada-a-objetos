class Principal{

	public static void main(String[] args) {

		Porta p1 = new Porta();
		
		p1.cor="Laranja";
        p1.dimensaox=1.50;
        p1.dimensaoy=0.50;
        p1.dimensaoz=0.50;

		p1.aberta(true);
		p1.pinta("Amarelo");
		p1.imprimir();
	}
}