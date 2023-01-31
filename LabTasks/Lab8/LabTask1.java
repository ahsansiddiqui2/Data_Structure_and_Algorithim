class LabTask1<V>{
    Node<V> head;
    int size=0;
    LabTask1(){
        head=null;
    }
    public static void main(String[] args) {
        LabTask1<String> lt = new LabTask1<>();
        lt.InserAtFirst("Hello");
        lt.InserAtFirst("World");
        lt.DeleteFirst();
        lt.DisplayForward();
    }
    public void InserAtFirst(V data){
        Node <V> newNode = new Node<>(data); 
        if(size==0)
        head = newNode;
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    
    }
    public void DisplayForward(){
        Node<V> tempNode = head;
        while (tempNode!=null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
    public void DeleteFirst(){
        if(size==0)
        head= null;
        else{
            head = head.next;
            head.prev =null;
            size--;
        }

    }
}
class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data){
        this.data = data;
        next = null;
        prev = null;
    }
    
}