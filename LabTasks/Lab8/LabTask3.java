class LabTask3 {
	Node head;
	public static void main(String[] args) {
		
	}
	public void addAfter(char dat){
		Node temp = new Node(dat);
		if(size==0){
			head = temp;
			return;
		}
		else{

		}


	}
	public void Display(){
		Node temp ;
		for(temp = head;temp!=null;temp=temp.next){
			System.out.println(temp.data);
		}
	}
}
class Node{
	char data;
	Node next;
	Node prev;
	Node(char data){
		this.data = data;
	}
	
} 