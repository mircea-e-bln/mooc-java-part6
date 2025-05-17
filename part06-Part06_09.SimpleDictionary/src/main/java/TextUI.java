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
            String command = scan.next();
            
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } 

            else if(command.equals("add")){
                addWordCommand();
            }

            else if(command.equals("search")){
                searchTranslationCommand();
            }

            else {
                System.out.println("Unknown command");
            }


            
        }
       
    }

    public void addWordCommand(){
        System.out.println("Word:");
        String word = this.scan.next();
        System.out.println("Translate:");
        String translate = this.scan.next();
        this.dictionary.add(word, translate);
    }

    public void searchTranslationCommand(){
        System.out.println("To be translated:");
        String word = this.scan.next();
        String translation = this.dictionary.translate(word);
        
        if(translation == null){
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }

    }


}
