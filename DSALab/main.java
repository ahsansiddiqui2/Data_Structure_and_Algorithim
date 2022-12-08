import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Lab2 lab2 = new Lab2();
		
		switch (lab2.Menu()) {
			case 1:lab2.inputArray(); break;
			case 2:lab2.DisplayTheArray(); break;
			case 3:lab2.SearchInArray(); break;
			case 4:lab2.UpdateArray(); break;
			case 5:lab2.InsertionInArray(); break;
			case 6:lab2.DeletionInArray(); break;
			default:
				System.out.println("Invalid Input");
		}
}
	}
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