public class Item {
    private String itemName;
    private int itemWeight;

    public Item(String itemName, int itemWeight){
        this.itemName = itemName;
        this.itemWeight = itemWeight;
    }

    public String getName(){
        return this.itemName;
    }

    public int getWeight(){
        return this.itemWeight;
    }

    public String toString(){

        return this.itemName + " (" + this.itemWeight + " kg)";
    }

}
