public class LinkedListHw{
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

    }
    public static void main(String[] args) {
        
    }
}