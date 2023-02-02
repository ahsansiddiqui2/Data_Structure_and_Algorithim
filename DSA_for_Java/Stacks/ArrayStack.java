import org.w3c.dom.ls.LSException;

class Main{
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(7);
        s.push(4);
        s.push(6);
        s.push(7);
        s.push(8);
        LinkedStack w = s.toLinkedStack();
        System.out.println(w.toString());
        LinkedStack e = new LinkedStack();
        e.push(4);
        e.push(7);
        e.push(93);
        e.push(900);
        ArrayStack a = e.toArrayStack();
        System.out.println(a.toString());
    }
}
class ArrayStack implements Stack{
    Object[] a;
    int size;
    ArrayStack(int s){
        a = new Object[s];
        size = 0;
    }
    public void push(Object b){
        a[size++] = b;
    }
    public Object pop(){
        Object temp = a[size-1];
        a[size-1]=null;
        size--;
        return temp;
    }
    public void peek(){
        System.out.println(a[size-1]);
    }
    public int size(){
        return size;
    }
    public String toString(){
        StringBuffer s = new StringBuffer();
        for(Object o:a){
            s.append(String.valueOf(o));
        }
        return String.valueOf(s);
    }
    // LinkedStack toLinkedStack(){
    //     LinkedStack ls =new LinkedStack();
    //     for(int i=0;i<size();i++){
    //         ls.push(a[i]);
    //     }
    //     return ls;
    // }
    LinkedStack toLinkedStack(){
        LinkedStack l = new LinkedStack();
        int s = size - 1;
        l.top = new Node(a[s]);
        --s;
        Node p =l.top;
        for(int i=size-2;i>=0;--i){
            p.next = new Node(a[i]);
            p=p.next;
        }
        return l;
    }
}
interface Stack{
    void push(Object a);
    Object pop();
    void peek();
}
