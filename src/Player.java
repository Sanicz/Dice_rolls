import java.util.Random;

public class Player {
    private Random brain = new Random();
    private String name ="Anonim";

    public Player(String playerName){
        setImieGracza(playerName);
    }
    public Player(){

    }

    public void setImieGracza(String name){
        if(name == null || name.isEmpty()){

            System.err.println("Błędne imie!");
        }
        else{
        this.name =name ;
      }
    }
    public String getName(){

        return name;
    }

    public int guess(){
    int number = brain.nextInt(6)+1;
    return number;
}
}
