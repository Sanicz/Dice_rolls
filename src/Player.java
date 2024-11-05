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
        // if(name == null || name.isEmpty()){
        if(name !=null && name.matches("^[A-Za-z0-9_\\-.]{3,}$")){
            this.name =name ;
        }
        else{
            throw new IllegalArgumentException("Nieprawidlowe imie");

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
