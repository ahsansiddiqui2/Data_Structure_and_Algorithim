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
    LinkedStack toLinkedStack(){
        LinkedStack ls =new LinkedStack();
        for(Object obj:a){
            ls.push(obj);
        }
        return ls;
    }
}
interface Stack{
    void push(Object a);
    Object pop();
    void peek();
}
