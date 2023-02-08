class LinkedStack{
    Node top ;
    int size;
    //1
    public void push(Object a){
        top = new Node(a,top);
        size++;
    }
    //2
    public Object pop(){
        if(size==0) return "LinkedList is empty";

        Object obj = top.data;
        top = top.next;
        size--; 
        return obj;
    }
    //3
    public Object peek(){
        if(size==0) return "LinkedList is empty";
        return top.data;
    }
    //4
    public int size(){
        return size;
    }
    //5
    ArrayStack toArrayStack(){
        ArrayStack as = new ArrayStack(size);
        Node t = reverse(top);
        for(Node temp = t;temp!=null;temp = temp.next){
            as.push(temp.data);
        }
        reverse(top);
        return as;
    }
    //6
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    //7
    public String toString(){
        StringBuffer s = new StringBuffer();
        Node temp = reverse(top);
        for(Node t=temp;t!=null;t=t.next){
            s.append(t.data);
        }
        return String.valueOf(s);
    }
    
}

class Node{
    Object data;
    Node next;
    Node(Object data){
        this.data = data;
    }
    Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

}