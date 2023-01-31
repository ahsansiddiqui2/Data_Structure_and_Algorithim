class StackH{
    public static void main(String[] args) {
        
        ArrayStack a = new ArrayStack(7);
        
        ArrayStack b = new ArrayStack(7);
        
        System.out.println(a.isEmpty());
        
        a.push(3);
        a.push(2);
        a.push(1);
        a.push(0);
        a.push(23);
        a.push(45);
        a.push(399);   
     for(int i=0;i<a.size();i++){
        b.push(a.pop());
     }
        }
}
class ArrayStack implements Stack{
    Object[] a;
    int size;
    ArrayStack(int s){
        a = new Object[s];
        size = 0;
    }
   
    public boolean equals(ArrayStack d){
        for (int i=0;i<size;i++ ) {
        if(d.a[i]!=a[i])
            return false;
        }
        return true;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public String toString(){
        String toStr = "[ ";
        for(Object o: a){
            toStr += String.valueOf(o+", ");
        }
        toStr+=" ]";
        return toStr;

    }
    private void resize(){
		Object [] aa = a;
		a = new Object[2*aa.length];
		System.arraycopy(aa,0,a,0,size);
	}
   
    public void Lastpop(){
        // Object[] ab = {1, 2, 3};      
      Object[] ac = a;
      a= new Object[2*a.length];
      System.arraycopy(a, 1, ac, 0, ac.length);
        // Object aa=a;
        // a=new Object[a.length-1];
        // System.arraycopy(a,1,aa,0,aa.length);
        // a = aa;
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
