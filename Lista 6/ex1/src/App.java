public class App {
    public static void main(String[] args) throws Exception {
       
        Robo robo = new Robo("Robo1", 'n', 2, 2);
        robo.move();
        robo.posicao();
        robo.movePraTras(1);


        Robo robo2 = new Robo("Robo2");
        robo2.move(2);
        robo2.move(3);
        robo2.posicao();
        robo2.movePraTras(1);
        robo2.posicao();
    }
}
