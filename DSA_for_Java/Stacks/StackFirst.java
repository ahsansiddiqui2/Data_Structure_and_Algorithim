class StackFirst {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.push("Apple");
		stack.push("Oranges");
		stack.size();
		stack.push("Grapes");
		stack.pop();
		stack.size();
		stack.push("Percimen");

	}
}
class ArrayStack implements Stack{
	private int size;
	private Object [] a;
	

	public boolean isEmpty(){
		return (size==0);
	}

	ArrayStack(int b){
		a = new Object[b];
		size = b;	
	}
	
	private void resize(){
		Object [] aa = a;
		a = new Object[2*aa.length];
		System.arracopy(aa,0,a,0,size);

	}

	public Object peek(){
		if(size == 0) return IllegalStackException("Stack Empty");
		return a[size-1];
	}
	
	public Object pop(){
		if(size ==0) return IllegalStackException("Stack Empty");
		Object obj = a[--size];
		a[size] = null;
		return obj;
	}
	public Object push(Object obj){
		if(size == a.length) resize();
		a[size++] = obj;
		return a[size-1];
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