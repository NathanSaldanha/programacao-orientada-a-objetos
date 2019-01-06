class BalancoTrimestral{

	public static void main(String[] args) {
		int janeiro=15000;
		int fevereiro=23000;
		int marco=17000;

		int trimestral= janeiro+fevereiro+marco;
		int media = trimestral/3;

		System.out.println(trimestral);
		System.out.println("Valor da media mensal ="+media);	
	}
}