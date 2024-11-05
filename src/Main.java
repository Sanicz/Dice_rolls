import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rande = new Random();
        int number=0;
        int playerGuess;
        int mode=1;

        Player gambler;
        if(mode==1){
            gambler = new Player();
        }
        else{
            gambler = new Guess();
        }

       // Player notGambler= new Player();
       // System.out.println(notGambler.getName());

       //  Guess gambler = new Guess();


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
