class StackFirst {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		
		stack.push("Apple");
		stack.push("Oranges");
		System.out.println( stack.size());
		stack.push("Grapes");
		stack.pop();
		System.out.println( stack.size());
		stack.push("Percimen");
		System.out.println(stack.size());
		System.out.println();
	}
}
class ArrayStack implements Stack{
	public int size;
	public Object [] a;
	
	ArrayStack(int b){
		a = new Object[b];
		size = 0;	
	}
	
	public boolean isEmpty(){
		return (size==0);
	}

	public boolean equals(ArrayStack c){
		for (int i = 0; i < size; i++) {
			if (a[i]!=c.a[i]) {
				return false;
			}
		}
		return true;  
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
	
	public Object pop(){
		if(size ==0) return IllegalStackException("Stack Empty");
		Object obj = a[--size];
		a[size] = null;
		return obj;
	}
	private Object IllegalStackException(String string) {
		return null;
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
	Object push(Object obj);
	int size();
}