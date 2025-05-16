import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String word = scan.next();

            if(alreadyEntered(word)){
                System.out.println("Bye bye!");
                break;
            }

            System.out.println("Unknown command");
        }

    }

    public boolean alreadyEntered(String word){
        if(word.equals("end")){
            return true;
        }
        return false;
    }


}
