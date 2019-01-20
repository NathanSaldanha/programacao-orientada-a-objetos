class Pessoa{
	
	String nome;
	int idade;
	

	void fazAniversario(int valor){
		this.idade+=valor;
	}
	void imprimir(){
		System.out.println(nome);
		System.out.println(idade);
	}
}