public class Homework {
    public static void main(String[] args) {
        ArraysStack as = new ArraysStack(7);
        ArraysStack ad = new ArraysStack(7);
        System.out.println("the first array stack is empty? "+as.isEmpty());
        ad.push("3");
        as.push("3");
        
        ad.push("2");
        as.push("2");
        
        ad.push("1");
        as.push("1");

        ad.push("5");
        as.push("5");

        ad.push("7");
        as.push("7");

        ad.push("sam");
        as.push("sam");

        ad.push("34");
        as.push("34");
        System.out.println(as.toString());
        System.out.println("These array stacks are equal? "+as.equals(ad));
        ad.firstDelete();
        System.out.println(ad.toString());
        ad.reverse();
        System.out.println(ad.toString());
        ad.copy(as);
    }
    
}

class ArraysStack implements Stack{
    Object [] a;
    int size;
    ArraysStack(int Size){
        a = new Object[Size];
        size=0;
    }

    public boolean isEmpty(){
        return (size==0);
    }
    public boolean equals(ArraysStack s){
        if(size==s.size){
        for(int i=0;i<a.length;i++){
            if(a[i]!=s.a[i]){
                return false;
            }
        }
        return true;
    }
        return false;
    }

    public String toString(){
        String to = "[";
        for(int i=0;i<size;i++){
            if(i<size-1){
                to+=String.valueOf(a[i])+", ";
            }
            else
            to+=String.valueOf(a[i]);
        }
        to+="]";
        return to;
    }

    public void firstDelete(){
        // System.arraycopy(a,1,a,0,size-1);
        // a[size]=  null;
        for(int i =0;i<size-1;i++){
            a[i] = a[i+1];
        }
        a[--size] = null;
    }

    public void reverse(){
        int i = 0;
        int j = size - 1;
        while(i<= j){
            Object temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public void copy(ArraysStack s){
        for(int i=(s.size()-1);i>=0;--i){
            this.push(s.pop());
        }
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
}

interface Stack{
    void push(Object a);
    Object pop();
    void peek();
}
