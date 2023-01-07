class Q{
	public static void main(String[] args) {
		Question1 q = new Question1();
		q.Run();	
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}	
	Node(Node next,int data){
		this.data =data;
		this.next = next;
	}
}
class Question1{
	public void Run(){
		int[] arr = {5,7,9,11};
		int[] arr1 = {29,35,45};
		Node start1= new Node(arr[0]);
		Node p = start1.next;
		Node temp1 = p;
		for(int i =1;i<arr.length-1;i++){
			temp1 = new Node(arr[i]);
			temp1=temp1.next;
		}
		Node start2 = new Node(arr1[0]);
		Node q = start2.next;
		Node temp = q;
		for(int i =1;i<arr.length-1;i++){
			temp = new Node(arr1[i]);
			temp=temp.next;
		}
		
		System.out.println(Sum(arr,arr1));
		System.out.println(High(arr,arr1));
		System.out.println(sum( start1,start2));
		System.out.println(High1( start1,start2));
	}
	public int Sum(int[]arr,int[] arr1){
		int sum = 0;

		for(int i:arr){
			sum+=i;
		}
		for(int i:arr1){
			sum+=i;
		}
		return sum;
	}
	public int High(int[] arr,int [] arr1){
		int highest = 0;
		for(int i: arr){
			if(i>highest)highest = i;
		}
		for(int i: arr1){
			if(i>highest) highest = i;
		}
		return highest;
	}
	public int sum(Node start,Node start1){
		int sum=0;
		for(Node p = start;p!=null;p=p.next){
			System.out.println(p.data);
		}
		for (Node q = start1;q!=null ;q=q.next ) {
			sum+=q.data;
		}
		return sum;
	}
	public int High1(Node start,Node start1){
		int highest =0;
		for(Node p = start;p!=null;p=p.next){
			if(highest<p.data) highest = p.data;
		}
		for(Node q = start1;q!=null;q=q.next){
			if(highest<q.data)highest = q.data;
		}
		return highest;
	}
}