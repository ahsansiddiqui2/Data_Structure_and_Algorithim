class Lab4{
	public static void BubbleSort1D(int[] arr){
		for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
	}
	public static void BubbleSort2D(int [][] arr){}
	public static void SelectionSort1D(int [] arr){
		for(int i = 0; i<arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex] = temp;
        }
	}
	public static void SelectionSort2D(int [][] arr){

	}
	public static void InsertionSort1D(int [] arr){

	}
	public static void InsertionSort2D(int [][] arr){

	}
	public static void QuickSort1D(int[] arr){}
	public static void QuickSort2D(int [] [] arr){}

	public void Run(int[] arr1d,int [][] arr2d){
		long [] total = new long[9];
		total[0] = 0s;
		//array 1d
		long before = System.nanoTime();
		BubbleSort1D(arr1d);
		long after = System.nanoTime();
		total[1] = after - before;
		
		before = System.nanoTime();
		SelectionSort1D(arr1d);
		after = System.nanoTime();
		total[2] = after - before;
		before = System.nanoTime();
		InsertionSort1D(arr1d);
		after = System.nanoTime();
		total[3] = after - before;

		before = System.nanoTime();
		QuickSort1D(arr1d);
		after = System.nanoTime();
		total[4] = after - before;

		//array 2d
		before = System.nanoTime();
		BubbleSort2D(arr2d);
		after = System.nanoTime();
		total[5] = after - before;

		before = System.nanoTime();
		SelectionSort2D(arr2d);
		after = System.nanoTime();
		total[6] = after - before;

		before = System.nanoTime();		
		InsertionSort2D(arr2d);
		after = System.nanoTime();
		total[7] = after - before;

		before = System.nanoTime();
		QuickSort2D(arr2d);
		after = System.nanoTime();
		total[8] = after - before;
		for (long f : total) {
			
			System.out.println(f);
		}
	}
}