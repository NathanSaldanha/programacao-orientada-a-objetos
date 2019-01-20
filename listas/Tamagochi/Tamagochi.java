class Tamagochi{

	int saciedade,limpeza,energia;
    int diamantes=0;
    int idade=0;
    int energiaInicial,limpezaInicial, saciedadeInicial;
    String acao;


 	void energ( int energia){
 		this.energia = energia;
        this.energiaInicial=this.energia;
    }
    void fome(int fome){
    	this.saciedade = fome;
        this.saciedadeInicial=this.saciedade;

    }
    
    void limp(int limp){
    	this.limpeza = limp;
        this.limpezaInicial=this.limpeza;
    }

    boolean acoes(String acao){

        if(!acao.equals("brincar")&&!acao.equals("dormir")&&!acao.equals("mostrar")&&
               !acao.equals("comer")&&!acao.equals("banhar")&&!acao.equals("fim")){

                return false;
        }
        
        if(acao.equals("brincar")){
                if(this.energia<=0){
                    this.energia=0;
                    System.out.println("falhou: o bichinho esta morto ;-;");
                }else if(this.limpeza<=0){
                    limpeza=0;
                    System.out.println("falhou: o bichinho morreu de sujeira");
                }else if(this.saciedade<=0){
                    this.saciedade=0;
                    System.out.println("falhou: o bichinho morreu de fome");
                }else{
                    this.energia-=2;
                    this.saciedade-=1;
                    this.limpeza-=3;
                    this.diamantes++;
                    this.idade++;
                }

        }
        
        if(acao.equals("comer")){
                if(this.energia<=0){
                    this.energia=0;
                    System.out.println("falhou: o bichinho esta morto ;-;");
                }else if(this.limpeza<=0){
                    limpeza=0;
                    System.out.println("falhou: o bichinho morreu de sujeira");
                }else if(this.saciedade<=0){
                    this.saciedade=0;
                    System.out.println("falhou: o bichinho morreu de fome");
                }else{
                    this.energia-=1;
                    this.limpeza-=2;
                    this.saciedade+=4;
                    this.idade++;
                    if(this.saciedade>saciedadeInicial){
                        this.saciedade=saciedadeInicial;
                    }
                }

        }
        
        if(acao.equals("dormir")){
                if(this.energia<=0){
                    this.energia=0;
                    System.out.println("falhou: o bichinho esta morto ;-;");
                }else if(this.limpeza<=0){
                    this.limpeza=0;
                    System.out.println("falhou: o bichinho morreu de sujeira");
                }else if(saciedade<=0){
                    this.saciedade=0;
                    System.out.println("falhou: o bichinho morreu de fome");
                }else if(this.energiaInicial-this.energia<5){
                   System.out.println("Falhou: O bichinho nao esta cansado");
               }else{
                   this.saciedade-=1;
                   this.idade+=(this.energiaInicial-energia);
                   this.energia=this.energiaInicial;
                   
               }

        }
         
        if(acao.equals("banhar")){
                if(this.energia<=0){
                    this.energia=0;
                    System.out.println("falhou: o bichinho esta morto ;-;");
                }else if(this.limpeza<=0){
                    this.limpeza=0;
                    System.out.println("falhou: o bichinho morreu de sujeira");
                }else if(this.saciedade<=0){
                    this.saciedade=0;
                    System.out.println("falhou: o bichinho morreu de fome");
                }else{
                    this.saciedade-=1;
                    this.energia-=3;
                    this.idade+=2;
                    this.limpeza=limpezaInicial;
                }
        }
        if(acao.equals("mostrar")){
                mostrar();
        }
        return true;
        
    }
    void mostrar(){
    	System.out.println();
    	System.out.println("Definicoes de niveis de energias:");
        System.out.println("ENERGIA        FOME        LIMPEZA        DIAMANTES    IDADE");
        System.out.println("Energia:"+this.energia+"|"+this.energiaInicial+", Fome:"+this.saciedade+"|"+this.saciedadeInicial+", Limpeza:"+this.limpeza+"|"+this.limpezaInicial+", Diamantes:"+this.diamantes+", Idade:"+this.idade);
        
    }

}