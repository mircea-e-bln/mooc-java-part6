import java.util.ArrayList;

public class Hold  {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (this.maximumWeight >= (this.totalWeight() + suitcase.totalWeight())) {
            this.suitcase.add(suitcase);    
        }
        
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcase) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }
    
    public String toString(){

        if(this.suitcase.isEmpty()){
            return null;
        }
        int numberOfSuitcase = Integer.valueOf(this.suitcase.size());

        int totalWeight = 0;
        for(Suitcase per: this.suitcase){
            totalWeight = totalWeight + per.totalWeight();
        }

        return numberOfSuitcase + " suitcases (" + totalWeight + " kg)" ;
    }

    public void printItems(){
        for(Suitcase per:suitcase){
            per.printItems();
        }
    }

}
