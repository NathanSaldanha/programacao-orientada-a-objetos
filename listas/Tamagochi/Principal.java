import java.util.Scanner;

class Principal{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Tamagochi jogo = new Tamagochi();


                System.out.println("Defina os niveis de energia");
                jogo.energia=scan.nextInt();
                System.out.println("Defina os niveis de fome");
                jogo.saciedade= scan.nextInt();
                System.out.println("Defina os niveis de limpeza");
                jogo.limpeza=scan.nextInt();
                

                jogo.energiaInicial=jogo.energia;
                jogo.limpezaInicial=jogo.limpeza;
                jogo.saciedadeInicial=jogo.saciedade;

                jogo.energ(jogo.energia);
                jogo.fome(jogo.saciedade);
                jogo.limp(jogo.limpeza);
                jogo.mostrar();


                do{
                        System.out.println();
                        System.out.println("Essas sao suas acoes: | brincar | comer | banhar | dormir | mostrar | sair");
                        jogo.acao=scan.next();
                        jogo.acoes(jogo.acao);   
            
                }while(!jogo.acao.equals("sair"));


	}
}