import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rande = new Random();
        int number=0;

        Player gambler = new Player("Sasha");
        Player notGambler= new Player();
        System.out.println(notGambler.getName());
        int playerGuess;


       // gambler.setImieGracza("");
      //  gambler.imieGracza = "Sasha";


        do {

            number = rande.nextInt(6) + 1;

            System.out.println("Kostka: " + number);

            playerGuess =gambler.guess();

            System.out.println("Gracz : "+gambler.getName() +", "+ playerGuess);


            if (number == playerGuess) {
                System.out.println("BRAWO!");
            }
            else {
                System.out.println("ŹLE!");
            }

        } while (number != playerGuess);
    }
}
