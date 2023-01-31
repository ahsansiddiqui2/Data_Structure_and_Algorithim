class LinkedList{
	public static void main(String[] args){
		Node n = new Node(0);
		Node p = n;
		p.next = new Node(1);
		p  = p.next;
		p.next  = new Node(2);
		for(Node w = n; w!=null;w= w.next){
			System.out.println(w.data);
		}
	}
}
class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}	
	}