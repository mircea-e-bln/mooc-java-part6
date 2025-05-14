import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;


    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int totalWeight = 0;
        this.items.add(item);

        for(Item weightItem:items){
            totalWeight += weightItem.getWeight();
        }
          
        if(totalWeight > this.maximumWeight){
            this.items.remove(item);
        }
    

        
    }

    public String toString(){
        String totalItems = String.valueOf(this.items.size());

        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }

        int outputWeight = 0;
        for(Item per:items){
            outputWeight = outputWeight + per.getWeight();
        }

        if(this.items.size() <= 1){
            return totalItems +  " item (" + outputWeight + " kg)";
        }


        String returnValue = totalItems +  " items (" + outputWeight + " kg)";

        return returnValue;

    }

    public void printItems(){
       
        for(Item itemIteration: items){
            System.out.println(itemIteration);
            
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        
        for(Item per:items){
            totalWeight = totalWeight + per.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem(){

       if(this.items.isEmpty()){
            return null;
       }

        Item obj = this.items.get(0);

       for(Item per:this.items){
            if(obj.getWeight() < per.getWeight()){
                obj = per;
            }
       }

       return obj;
    }
}
