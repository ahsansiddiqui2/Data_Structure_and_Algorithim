public class LinkedListHw{
    public static void main(String[] args) {
        String sentence = "I love my university. I have been studying in this university for last 12 months and these 12 months are best days of my life. The university have provided me platform applied form to enlight myself. I am keeping my loving my university for rest of my life.";
       
        Node start = new Node();
        Node p = start;
       
        for(String s: sentence.split(" ")){
            p.next = new Node(s);
            p = p.next;
        }
       
        PrintWords(start);
        Node search = Search(start);
        Print(search);
    
    }

    public static Node Search(Node start){
        Node search = new Node ();
        Node p = search;
        for(Node i = start;i!=null;i=i.next){
            p.next = new Node(i.words);
            for(Node j = start;j!=null;j=j.next){
                if(Find(search,j.words)){
                if(p.next.words.equals(j.words))
                p.next.count++;
            }
        }
            p = p.next;
        }
        return search;
    }

    public static boolean Find(Node start,String s){
        for(Node i = start;i!=null;i=i.next){
            if(i.words.equals(s))
            return true;
            
        }
        return false;
    }

    public static void PrintWords(Node start){
        for (Node  i = start; i !=null; i=i.next) {
            
            System.out.print(i.words+" ");
        }
        System.out.println();
    }
    public static void Print(Node start){
        for (Node  i = start; i !=null; i=i.next) {
            System.out.println(i.words+" : "+i.count);
        }
    }
}


class Node{
    String words;
    int count;
    Node next;

    Node(String words, int count){
        this.words =  words;
        this.count = count;
    }

    Node(String words){
        this.words = words;

    }

    Node(String words, Node next){
        this.words = words;
        this.next = next;
    }

    Node(){
        this.words = "";
        this.count = 0;
    }

}