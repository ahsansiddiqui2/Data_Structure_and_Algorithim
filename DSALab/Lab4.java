import java.util.Arrays;
class Lab4{
public static void main(String[] args) {
	int [] arr = {180,165,150,170,145};
	int [] [] arr2d = {{2,10,15},
						{5,1,3},
						{6,9,4},
};
	Oned.run(arr,arr2d);	
}
}
class Oned{
	public static void BubbleSort1D(int[] arr){
	int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        }
	
	public static void SelectionSort1D(int [] arr){
	 int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

	}
	
	
	public static void InsertionSort1D(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

	public static void QuickSort1D(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
public static void BubbleSort2D(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length - 1; j++) {
        if (arr[i][j] > arr[i][j + 1]) {
          int temp = arr[i][j];
          arr[i][j] = arr[i][j + 1];
          arr[i][j + 1] = temp;
        }
      }
    }

}
public static void SelectionSort2D(int [][] arr){

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        int minIndex = j;
        for (int k = j + 1; k < arr[i].length; k++) {
          if (arr[i][k] < arr[i][minIndex]) {
            minIndex = k;
          }
        }
        int temp = arr[i][j];
        arr[i][j] = arr[i][minIndex];
        arr[i][minIndex] = temp;
      }
    }

  }
public static void InsertionSort2D(int [][] arr){
	
	for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr[i].length; j++) {
        int key = arr[i][j];
        int k = j - 1;
        while (k >= 0 && arr[i][k] > key) {
          arr[i][k + 1] = arr[i][k];
          k--;
        }
        arr[i][k + 1] = key;
      }
    }
}
	
public static void QuickSort2D (int [][] arr){
	 
    for (int i = 0; i < arr.length; i++) {
      quickSort(arr[i], 0, arr[i].length - 1);
    }

  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);

      quickSort(arr, low, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, high);
    }
  }





public static void run(int[] arr1d,int[][] arr2d){
		String [][] total = new String[8][2];
		
		long before = System.nanoTime();
		BubbleSort1D(arr1d);
		long after = System.nanoTime();
		total[0][0]= "BubbleSort1D";
		total[0][1] = Long.toString(after - before);
		
		before = System.nanoTime();
		SelectionSort1D(arr1d);
		after = System.nanoTime();
		total[1][0] = "SelectionSort1D";
		total[1][1] = Long.toString(after - before);

		before = System.nanoTime();
		InsertionSort1D(arr1d);
		after = System.nanoTime();
		total[2][0] = "InsertionSort1D";
		total[2][1] = Long.toString(after - before);

		before = System.nanoTime();
		QuickSort1D(arr1d,0,arr1d.length-1);
		after = System.nanoTime();
		total[3][0]="QuickSort1D";
		total[3][1] = Long.toString(after - before);

		before = System.nanoTime();
		BubbleSort2D(arr2d);
		after = System.nanoTime();
		total[4][0] = "BubbleSort2D";
		total[4][1] = Long.toString(after - before);

		before = System.nanoTime();
		SelectionSort2D(arr2d);
		after = System.nanoTime();
		total[5][0] = "SelectionSort2D";
		total[5][1] = Long.toString(after - before);

		before = System.nanoTime();		
		InsertionSort2D(arr2d);
		after = System.nanoTime();
		total[6][0] = "InsertionSort2D";
		total[6][1] = Long.toString(after - before);

		before = System.nanoTime();
		QuickSort2D(arr2d);
		after = System.nanoTime();
		total[7][0]="QuickSort2D";
		total[7][1] = Long.toString(after - before);

		for (String[] total1 : total) {
			System.out.print("Time took by ");
			for (String one :total1 ) {
				
			System.out.print(one+ " ");
			}
			System.out.println();
		}
	}
}