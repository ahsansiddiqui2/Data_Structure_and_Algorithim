import java.util.Scanner;
public class Lab2{
	Scanner scan = new Scanner(System.in);
	int[] arr;
	public int Menu(){
		System.out.println("Menu: ");
		System.out.println("1 - Input Array/Create Array ");
		System.out.println("2 - Display Array ");
		System.out.println("3 - Search ");
		System.out.println("4 - Update ");
		System.out.println("5 - Insertion ");
		System.out.println("6 - Deletion ");
		System.out.println("7 - Exit ");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
		return choice;
	}
	int [] inputArray(){
		System.out.print("Enter the size of array: ");
		int size = scan.nextInt();
		arr = new int[size];
		for(int i = 0 ; i<arr.length;i++){
			arr[i]= scan.nextInt();
		}
		return arr;
	}
	void DisplayTheArray(){
		System.out.print("[");
		for (int i=0;i<arr.length;i++) {
			
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}
			else
			System.out.print(arr[i]);
		}
		System.out.println("]");
	}
	int SearchInArray(){
		System.out.println("Enter the target you want to find: ");
		int target = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== target){
				return i;
			}
		}
		return -1;
	}

	void UpdateArray(){
		System.out.println("Updating the array");
	}
	void InsertionInArray(){
		System.out.println("Inserting the array");
	}
	void DeletionInArray(){
		System.out.println("Deleting an array");
	}
	
}