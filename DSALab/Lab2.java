import java.util.Scanner;
public class Lab2{
	Scanner scan = new Scanner(System.in);
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
	void inputArray(){
System.out.println("We input array");
	}
	void DisplayTheArray(){
		System.out.println("Displaying array");
	}
	void SearchInArray(){
		System.out.println("Searching in array");
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