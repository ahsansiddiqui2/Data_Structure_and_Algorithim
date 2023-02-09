import java.util.Arrays;

class ArrayStack <T>{
    T [] a;
    int size;
    ArrayStack(Class <T> claz, int Size){
        a = (T[]) new Object[Size];
        size = 0;
    }
    public T peek(){
        return a[size-1];
    }
    public void push(T o){
        a[size++] = o;

    }
    public T pop() {
        T temp = a[size-1];
        a[size-1] = null;
        --size;
        return temp;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void display(){
        for(T obj:a){
            System.out.println(obj);
        }
    }
    public void search(T data){
        for(T obj:a){
            if(data==obj){
                System.out.println("Data found. Data is: "+obj);
                break;
            }
        }
    }
    
}
