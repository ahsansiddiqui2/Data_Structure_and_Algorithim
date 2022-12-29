class Linked{
	int data;
	Linked next;
	Linked(int data){
		this.data = data;
	}
	public static void main(String[] args){
		Linked start = new Linked(2);
		start.next = new Linked(3);
		Linked p = start.next;
		Linked tail1 = p;
		for(int i=0;i<5;i++){
			tail1.next = new Linked(i);
			tail1 = tail1.next;
		}
		System.out.println(Sum(p)); 
		System.out.println(Average(p));
	}
	public static int Sum(Linked p){
			
		int sum = 0;
		int count = 0;
		for(Linked s = p;s!=null;s=s.next){
			sum+= s.data;
			count++;
		}
		
		return sum;
	}
	public static float Average(Linked tail){

		float sum = 0;
		float count = 0;
		for(Linked s = tail;s!=null;s=s.next){
			sum+= s.data;
			count++;
		}
		float average = (float)sum/count;
		return average;
	}
}