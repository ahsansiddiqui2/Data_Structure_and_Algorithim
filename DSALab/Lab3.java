import java.util.Arrays;

class Lab3{
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

		public int LinearSearch1D(int [] A,int key){
		for(int i = 0;i<A.length;i++){
			if(A[i]==key){
				return i;
			}
			
		}
		return -1;
	}	
	public int[] LinearSearch2D(int [][] A,int key){
		int[] pos = new int[2];
		for(int i =0;i<A.length;i++){
			for(int j = 0;j<A[i].length;j++){
				if(A[i][j]==key){
					pos[0]=i;
					pos[1]=j;
					break;
				}
			}
		}
		return pos;
	}
		public int BinarySearch1D(int [] A,int key){
			Arrays.sort(A);
		int first = 0;
		int last = A.length-1;

		while(first<=last){
			int mid = (first+last)/2;
			if(A[mid]==key){
				return mid;
			}
			else if(A[mid]>key){
				last = mid-1;
			}
			else if(A[mid]<key){
				first = mid+1;
			}
		}
		return -1;
}
	
	public void BinarySearch2D(int [][]A,int key){
		for (int i = 0; i < A.length; i++) {
			Arrays.sort(A[i]);
		int first = 0;
		int last = A.length-1;

		while(first<=last){
			int mid = (first+last)/2;
			if(A[i][mid]==key){
				// return mid;
				System.out.println(mid);
				break;
			}
			else if(A[i][mid]>key){
				last = mid-1;
			}
			else if(A[i][mid]<key){
				first = mid+1;
			}
		}
		// return -1;
		}

	}

	public void Run() {
		
		long before = System.nanoTime();
		int x = LinearSearch1D(arr,6);
		long after = System.nanoTime();
		long timer = after-before;
		System.out.println(after-before);

		before = System.nanoTime();
		BinarySearch1D(arr,7);
		after = System.nanoTime();
		long time = after -before;

		System.out.println((after-before));
		if(timer>time){
			System.out.println("Linear Search");
		}
		else{
			System.out.println("binary Search");
		}
		before = System.nanoTime();
		BinarySearch2D(arr1,7);
		after = System.nanoTime(); 
		System.out.println((after-before));
		
		}
}