public class Robo {
   
   
    private String nome;
    private char direcao;
    private int x;
    private int y;
    
    
    public Robo() {
       
        this("", 'n' , 0, 0 );
    }


    public Robo(String nome) {
        this("nome", 'n', 0, 0);
    }


    public Robo(String nome, char direcao, int x, int y) {
        this.nome = nome;
        this.direcao = direcao;
        this.x = x;
        this.y = y;
    }



    public void move(){
        move(1);
    }

    public void move(int passos){
        switch(direcao){
            case 'n': 
            y+= passos;

            case 's': 
            y-= passos;

            case 'l': 
            x+= passos;

          case 'o': 
            x+= passos;


        }
    }

    public void movePraTras(){
        move(-1);
    }

    public void movePraTras(int passos){
        move(-passos);
    }

    public void posicao(){
        System.out.println("Nome: " + nome);
        System.out.println("Posição X: " + x);
        System.out.println("Posição Y: " + y);
        System.out.println("Direção: " + direcao);
    }



}
