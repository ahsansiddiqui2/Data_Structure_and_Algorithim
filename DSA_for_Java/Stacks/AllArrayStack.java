class ArrayStack implements Stack{
	Object [] arr;
	int size;
	//1
	ArrayStack(int Size){
		arr = new Object[Size];
		size=0;
	}
	//2
	public void push(Object obj){
		if(size>arr.length)
			resize();
		arr[size++] = obj;
	}
	//3
	public Object peek(){
		return arr[size-1];
	}
	//4
	public Object pop(){
		Object temp = arr[size-1];
		arr[size-1] = null;
		size--;
		return temp;
	}
	//5
	public int size(){
		return size;
	}
	//6
	public boolean isEmpty(){
		return (size==0);
	}
	//7
	public String toString(){
		StringBuffer s= new StringBuffer("[");
		for(int i=0;i<size;i++){
			s.append(String.valueOf(arr[i])+ " ");
		}
		s.append("]");
		
		return String.valueOf(s);
	}
	//8
	public LinkedStack toLinkedStack(){
		LinkedStack ls = new LinkedStack();

		for(int i=0;i<size;i++){
			ls.push(arr[i]);
		}
		return ls;
	}
	/*
	-------OR By fellas---------
	*/
	public LinkedStack toLinkedStack(int byC){
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
	//9
    public void firstDelete(){
    // System.arraycopy(a,1,a,0,size-1);
    // a[size]=  null;
    
    //---------------OR----------------
	
	for(int i =0;i<size-1;i++){
    	a[i] = a[i+1];
        }
    a[--size] = null;
    }
    //10
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
    //11
    public boolean equals(ArraysStack s){
    	boolean t = false;
        if(size==s.size){
        for(int i=0;i<a.length;i++){
            if(a[i]==s.a[i]){
        	     t=true;
            	 break;
            }
        }
    }
        return t;
    }
    //12
    public void copy(ArraysStack s){
        Object arr1[] = new Object[s.size()];
        for(int i=0;i<s.size();i++){
        	arr1[i] = s.pop();
        }
        for(int i=(arr1.length-1),j=0;i>=0;j++,--i){
        	if(arr.length>s.size())
        		resize();
            arr[j]=arr1[i];
            s.push(arr1[i]);
        }
    }
    //13
    public void resize(){
    	Object [] arr1= new Object[arr.length*2];
    	System.arraycopy(arr,0,arr1,0,size);
    	arr = arr1;
    }
    //14
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
}

interface Stack{
	Object pop();
	Object peek();
	void push(Object obj);
	int size();
}


//RPN Class given by Sir for single characters of operators

class Homew
{    public void main(String[] args) {
        String[] data={"4","3","a","3","8","4","A","d","S"};
        RPN obj=new RPN(data);
    }
}

class RPN{
    Stack stack;
    public RPN(String[] args){
        stack = new ArrayStack(args.length);
        for (int i=0;i<args.length;i++){
            String input = args[i];
            if (isAnOperator(input)){
                double x= Double.valueOf(String.valueOf(stack.pop()));
                double y= Double.valueOf(String.valueOf(stack.pop()));
                double z= calculate(x,y,input);
                stack.push(z);
            }
            else stack.push(input);
        }
    }

    private boolean isAnOperator(String op){
        return (op.length()==1 && (("ASMD".indexOf(op)>=0)||("asmd".indexOf(op)>=0))   );
    }

    private double calculate(double x,double y,String op){
    double z=0;
    if (op.equals("A") || op.equals("a"))  z=x+y;
    if (op.equals("S")||op.equals("s"))  z=x-y;
    if (op.equals("M")||op.equals("m"))  z=x*y;
    if (op.equals("D")||op.equals("d"))  z=x/y;
        System.out.println(x+" "+op+" "+y+" "+"="+z);
        return z;
    }
}