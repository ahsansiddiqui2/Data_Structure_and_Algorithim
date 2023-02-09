public class LinkedStack<C> {
    Node <C> top;
    int size=0;
    public void push(C data){
        if(top==null){
            top = new Node<C>(data);
        }
        else{
            top = new Node<C>(data,top);
        }
        size++;
    }
    public C pop(){
        if(isEmpty()){
            System.out.println("Underflow: stack is empty");
            return -1;
        }
        else{
        C temp = top.data;
        top = top.next;
        size--;
        return temp;
    }
}
    public C peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return (top ==null);
    }
    public int size(){
        return size;
    }   
    public void search(C data){
        for(Node<C> p = top;p!=null;p=p.next){
            if(p.data==data){
                System.out.println("Data found. Data is: "+p.data);
                break;
            }
        }
    }
    public void display(){
        Node temp ;
        for (temp = top;temp!=null ;temp=temp.next) {
            System.out.println(temp.data);
        }
    }
}


class Node<T>{
    T data;
    Node <T> next;
    Node(T data){
        this.data = data;
    }
    Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}