class LinkedStack{
    Node top ;
    int size;
    
    public void push(Object a){
        top = new Node(a,top);
        size++;
    }

    public Object pop(){
        if(size==0) return "LinkedList is empty";

        Object obj = top.data;
        top = top.next;
        size--; 
        return obj;
    }
    
    public Object peek(){
        if(size==0) return "LinkedList is empty";
        return top.data;
    }
    
    public int size(){
        return size;
    }
    
    ArrayStack toArrayStack(){
        ArrayStack as = new ArrayStack(size);
        Node t = reverse(top);
        for(Node temp = t;temp!=null;temp = temp.next){
            as.push(temp.data);
        }
        reverse(top);
        return as;
    }

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