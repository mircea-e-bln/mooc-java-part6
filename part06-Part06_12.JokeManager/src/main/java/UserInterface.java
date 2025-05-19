import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scan;
    

    public UserInterface(JokeManager jokes, Scanner scan){
        this.jokes = jokes;
        this.scan = scan;
    }


    public void start(){
        while(true){
            System.out.println("Commands:" + "\n" + "1 - add a joke" + "\n" + "2 - draw a joke" 
            + "\n" + "3 - list jokes" + "\n" + "X - stop");
            String input = this.scan.nextLine();
            if(input.equalsIgnoreCase("x")){
                return;
            }
            if(input.equals("1")){
                addAJoke();
            }
            if(input.equals("2")){
                drawAJoke();
            }
            if(input.equals("3")){
                printAllJokes();
            }

    
        }
    }

    public void addAJoke(){
        System.out.println("Write the joke to be added:");
        String newJoke = this.scan.nextLine();
        jokes.addJoke(newJoke);
    }

    public void drawAJoke(){
        System.out.println(this.jokes.drawJoke());

    }

    public void printAllJokes(){
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }
}
