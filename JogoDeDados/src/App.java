import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //declarar e instanciar um objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);
        // declarar e insanciar um obejto da classe Random
        Random random = new Random();
        // declarar outras variaveis 
        int number1, number2, sum, attempt, bet, option;
        boolean hit;
        // repetição do jogo
        do {
          number1 = random.nextInt(6) + 1;
          number2 = random.nextInt(6) + 1;
          sum = number1 + number2;
          System.out.println("Numero : " +number1 + "Numero 2: " + number2 + "Soma: " +sum);
          attempt = 3;
          hit = false;
          while (!hit && attempt > 0) {
            System.out.println("Faça sua Aposta: ");
            bet = scanner.nextInt();
            attempt--;
            if (sum == bet) {
                hit = true;

            } else{
                System.out.println("Voce ERROU !!!! Tentativas restantes : " + attempt);
                
            }
          }
          if (hit) {
            System.out.println("Parabens, voce ACERTOU !!!!!!");
          } else{
            System.out.println("VOCE PERDEU !!!");
          }
          System.out.println("Deseja jogar novamente? (0 - SIM / 1 - NÃO)");
          option = scanner.nextInt();
        } while (option == 0);
    }
}
