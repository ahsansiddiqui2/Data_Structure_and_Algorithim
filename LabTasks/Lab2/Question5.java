class Question5{
public static void main(String[] args) {
    int bags =52;
    MyJavaCoffeeOutlet.computeTotalCost(bags); 
    }
}
public class MyJavaCoffeeOutlet {
  public static void computeTotalCost(int numBags) {
        while((numBags%5)!=0){
        ++numBags;
    }

    double cost = 0;
    
    int numLargeBoxes = numBags / 20;
    cost += numLargeBoxes * 1.80;
    numBags -= numLargeBoxes * 20;

    int numMediumBoxes = numBags / 10;
    cost += numMediumBoxes * 1.00;
    numBags -= numMediumBoxes * 10;
    
    int numSmallBoxes = numBags / 5;
    cost += numSmallBoxes * 0.60;
    numBags -= numSmallBoxes * 5;

    cost += numBags * 0.55;
    System.out.println("Large Boxes: "+numLargeBoxes);
    System.out.println("Medium Boxes: "+numMediumBoxes);
    System.out.println("Small Boxes: "+numSmallBoxes);
    System.out.println("Total cost: "+ cost);
  }
}