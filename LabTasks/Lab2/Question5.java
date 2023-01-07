class Question5{
public static void main(String[] args) {
    float Larg = 1.8f;
    float Mid = 1.0f;
    float Smal = 0.6f;
    int LargCap = 0;
    int MidCap = 0;
    int smalCap = 0;
    int bags =52;
    while(bags%5!=0){
        bags++;
    }

    float cost1 = Larg *2*20;
    float cost2  =Mid *1*10;
    float cost3 = Smal*1*5;
    
    float total = cost1+cost2+cost3;
    System.out.println(total);
}
}
class MyJavaCoffeeOutlet{
    
    
}