import java.util.ArrayList;
import java.util.Random;


public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();
      
    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int randomIndex = draw.nextInt(this.jokes.size());
        return this.jokes.get(randomIndex);
    }

    public void printJokes(){
        for (String item : this.jokes) {
            System.out.println(item);
        }
    }
}
