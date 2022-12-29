public class LinkedList2{
	class Node{
		int data;
		Node next;
		Node(){}
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		Node(int data){
			this.data = data;
		}
		Node(Node next){
			this.next = next;
		}
	}
	public static int sizeOfNode(Node p){
		int count= 0;
		for(Node i = p;i!=null;i=i.next){
			count++;
		}
		return count;
	}
	public static Node delete(Node p,int x){
		if(p = null || p.data>x)
			return p;
		if(p.data == x)
			return p.next;
		for(Node i = p;i!=null;i = i.next){
			
			if(i.next.data > x){
				break;
			}
			if(i.next.data == x){
				i.data = i.next.data;
				break;
			}
		}
		return p;
	}
	public static Node insert(Node p, int x){
		if(p==null|| p.data>x){
			p = new Node(x,p);
			return p;
		}
		Node i = p;
		while(i!=null){
			if(p.next.data>x){
				break;
			}
		}
				i.next = new Node(x,i.next);
				return p;
		}
	}
	public static Node deleteLastelement(Node p){
		if(p==null){return p;}
		for(Node i = p;i!=null;i=i.next){
			if(i.next == null){
				return (i = null);
			}
			if(i.next.next == null){
				i.next = null;
			}

		}
		return p;
	}
	public static Node Copy(Node p){
	}
	public static Node concat(Node p,Node q){
		if(p==null){
			p.next = new Node(q);
		}
	}
	public static Node replace(){	}
	public static void main(String[] args) {
		
	}
}