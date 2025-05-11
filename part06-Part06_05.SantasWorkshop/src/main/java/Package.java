import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gift;


    public Package(){
        this.gift = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.gift.add(gift);
    }

    public int totalWeight(){
        if(this.gift.isEmpty()){
            return -1;
        }
        int totalWeight = 0;
        for(Gift per: this.gift){
            totalWeight += per.getWeight();
        }
        return totalWeight;

        
    }
}
