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
class LinkedList{
		Node head;
	//1
	public void Display(){

		for(Node w = head; w!=null;w= w.next){
			System.out.println(w.data);
		}
	}
	//2
	public int sizeOfNode(){
	
		int count= 0;
		for(Node i = head;i!=null;i=i.next){
			count++;
		}
		return count;
	}
	//3
	public Node Delete(int eltoDelete){
		if(head = null || head.data>eltoDelete)
			return head;
		if(head.data == eltoDelete)
			return head.next;
		for(Node i = head;i!=null;i = i.next){
			
			if(i.next.data > eltoDelete){
				break;
			}
			if(i.next.data == eltoDelete){
				i.data = i.next.data;
				break;
			}
		}
		return head;
	}
	//4
	public Node Insert(int x){
		if(head==null|| head.data>x){
			head = new Node(x,head);
			return head;
		}
		Node i = head;
		while(i!=null){
			if(head.next.data>x){
				break;
			}
		}
				i.next = new Node(x,i.next);
				return head;
		}
	//5
	public Node DeleteLastelement(){
		if(head==null){return head;}
		for(Node i = head;i!=null;i=i.next){
			if(i.next == null){
				i = null;
			}
			if(i.next.next == null){
				i.next = null;
			}

		}
		return head;
	}
	//6
	public Node Copy(){
		Node q = head;
		Node p = new Node(q.data);
		Node temp = p;
		for(Node t= q.next;t!=null;t=t.next){
			temp.next = new Node(t.data);
			temp = temp.next;
		}
		return p;
	}
	//7
	public Node Concat(Node nodeToJoin){
		Node temp = head;
		if(temp==null){
			temp.next = new Node(nodeToJoin);
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next = new Node(nodeToJoin);
		}
		return head;
	}
	//8
	public Node Replace(int dataToReplace,int rep){
	for(Node temp = head;temp!=null;temp=temp.next){
			if(temp.data==dataToReplace){
				temp.data = rep;
				}
			}
	}
	//9
	public int Sum(){
		int sum=0;
		for(Node temp = head;temp!=null;temp=temp.next){
			sum+=temp.data;
		}
		System.out.println("Sum is: "+sum);
	}
	//10
	public float Average(){
		float sum, average =0;
		int count = 0; 
		for(Node temp = head;temp!=null;temp=temp.next){
			sum+=temp.data;
			count++;
		}
		average = sum/count;
		System.out.println("Average is: " +average);
	}
	//11
	public void Search(int elToSearch){
		for(Node temp = head;temp!=null;temp = temp.next){
			if(temp.data==elToSearch){
				System.out.println("Element has been found.");
				break;
			}
		}
	}	
}