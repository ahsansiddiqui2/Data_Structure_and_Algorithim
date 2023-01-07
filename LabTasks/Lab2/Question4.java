import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        HittingGame hg = new HittingGame();
        hg.Hit();

    }
}
class HittingGame{
   private Random rand = new Random();
   private int YourTeam = rand.nextInt(5);
   private int EnemyTeam = YourTeam;
   private int YourPoint;
   private int Points1=0;
   private int EnemePoint;
   private int Points2=0;
    public void Hit(){
    for(int i=0;i<YourTeam;i++){
        System.out.println("Pair of numbers: ");
        YourPoint =rand.nextInt(5);
        EnemePoint = rand.nextInt(5);
        System.out.println("Number 1: "+YourPoint);
        System.out.println("Number 2: "+EnemePoint);
        if(YourPoint==EnemePoint){
            System.out.println("Enemy got hit by your team.");
            Points1++;
        } 
        else{
            System.out.println("You got hit by the enemy team!");
            Points2++;
        }
    }    
    if(Points1>Points2){
        System.out.println("you won");
    }
    if(Points2>Points1){
        System.out.println("You lose");
    }
    else{
        System.out.println("Draw");
    }
    }
}
