import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scan;


    public UserInterface(TodoList todoList, Scanner scan){
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String word = scan.nextLine();
            if(word.equals("stop")){
                break;
            } else if(word.equals("add")){
                addCommand();
            } else if(word.equals("list")){
                listCommand();
            } else if(word.equals("remove")){
                removeCommand();
            }
        }
    }

    private void addCommand(){
        System.out.println("To add:");
        String word = scan.nextLine();
        this.todoList.add(word);
    }

    private void listCommand(){
        this.todoList.print();
    }

    private void removeCommand(){
        System.out.println("Which one is removed?");
        int number = Integer.parseInt(scan.nextLine());
        this.todoList.remove(number);

    }
    


    
}

