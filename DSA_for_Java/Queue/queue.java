interface Queue{
	 void add(Object o);
	 Object first();
	 Object remove();
	 int size();
}
class Queue{
	Node head = new Node(null);
	private int size;

	public void add(Object o){
		head.prev.next = new Node(o,head.prev,head);
		head.prev = head.prev.next;
		size++;
	}
	public Object first(){
		if(size==0) throw Exception("Queue is empty");
		return head.head.data;
	}
	public Object remove(){
		Object temp = head.next.object;
		head.next = head.next.next;
		head.next.prev = head;
		size--;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return (size==0);

	}
	
}
class Node{
	Object obj;
	Node next=this;
	Node prev= this;
	Node(Object o){
		obj = o;
	}
	Node (Object o,Node p,Node n){
		obj = o;
		prev = p;
		next = n;
	}
}