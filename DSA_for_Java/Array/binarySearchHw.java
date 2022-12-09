import java.util.*;
class binarySearchHw{
	public static void main(String[] args) {
	Solution s = new Solution();
	s.BinarySearch();

	}
}
class Solution{
	public void BinarySearch(){
		Scanner scan = new Scanner(System.in);
				Random random = new Random();
		int[] [] arr = new int[10][3];

		for (int i=0;i<arr.length;i++ ) {
			for(int j=0;j<3;j++){
				arr[i][j] = random.nextInt(100);
			}
		}
		System.out.println("[");
		for (int i = 0 ;i<arr.length ;i++ ) {
		System.out.print("[");
			
			for (int j=0;j<3;j++) {
				if(j!=2)
				System.out.print(arr[i][j]+" ,");
			else
				System.out.print(arr[i][j]);

			}
			System.out.print("]");
			System.out.println();
		}
		System.out.print("]");
			System.out.println();

		//converting to one-d array
		int[] ar = new int[arr.length*3];
		int index = 0;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j = 0;j<3 ;j++ ) {
				ar[index] = arr[i][j];
				index++;
			}
			
		}
		//sorting
		for(int i =0;i<ar.length;i++){
			int minIndex = i;
			for(int j = i+1;j<ar.length;j++){
				if(ar[j]<ar[minIndex]){
					minIndex=j;
				}
			}
			int temp = ar[i];
			ar[i]=ar[minIndex];
			ar[minIndex] =temp;

		}
		
			System.out.print("[");
		for (int i  : ar ) {
			System.out.print(i+" ,");
		}
			System.out.println("]");
			System.out.print("Which element you want to search? ");
			int target = scan.nextInt();

			int p=0;
			int q = ar.length-1;
			int it = 0;
			while(p<=q){
				int i = (p+q)/2;
				if(ar[i]==target){
					System.out.println("Target found at index: "+i);
					break;
				}
				if(ar[i]>target){
					q=i-1;
				}
				else
					p=i+1;
				it++;
			}
			System.out.println("counter : "+it);

	}
}