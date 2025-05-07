
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){

        String printOutput = "";
        String itemsOnList = "";
        String collectionSize = "";

        if(elements.isEmpty()){
           return printOutput = "The collection " + this.name + " is empty.";
        }

        for(String iteration: elements){
            
            itemsOnList = itemsOnList + iteration + "\n";
        

            if(elements.size() == 1){
                collectionSize = " element:\n";
            }

            if(elements.size() > 1){
                collectionSize = " elements:\n"; 
            } 
            
        
        }


        
        return "The collection " + this.name +  " has " + elements.size() + collectionSize + itemsOnList;
        
    }
    
}
