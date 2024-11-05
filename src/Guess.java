import java.util.Scanner;

public class Guess extends Player{

    public int guess(){
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
       return number;
    }
}
