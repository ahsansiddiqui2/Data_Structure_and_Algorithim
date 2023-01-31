import java.lang.Object;
class StackInsert {
	public static void main(String[] args) {
			
	}
}
class ArrayStack implements Stack{
	private int size;
	private Object [] a;
	
	ArrayStack(int b){
		a = new Object[b];
		size = 0;	
	}
	
	public boolean isEmpty(){
		return (size==0);
	}

	private void resize(){
		Object [] aa = a;
		a = new Object[2*aa.length];
		System.arraycopy(aa,0,a,0,size);
	}

	public Object peek(){
		if(size == 0) return IllegalStackException("Stack Empty");
		return a[size-1];
	}
	
	private Object IllegalStackException(String string) {
		return null;
	}
	public Object pop(){
		if(size ==0) return IllegalStackException("Stack Empty");
		Object obj = a[--size];
		a[size] = null;
		return obj;
	}
	public void push(Object obj){
		if(size == a.length) resize();
		a[size++] = obj;

	}
	public int size(){
		return size;
	}

}

interface Stack  {
	Object peek();
	Object pop();
	void push(Object obj);
	int size();
}