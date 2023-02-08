class AllArray{
	public static void main(String[] args) {
		Arr a = new Arr(4);
	}
}
class Arr{
	int [] arr;
	int el;
	Arr(int Size){
		arr = new int[Size];
		el=0;
	}

	public void resize(){
		int arr1[] = new int[arr.length*2];
		System.arraycopy(arr,0,arr1,0,el);
		arr = arr1;
	}

	public void add(int element){
		if(el>arr.length)
			resize();
		arr[el] = element;
		el++;
	}
	
	public void delete(int pos){
		if(pos<arr.length){
		arr[pos-1] = 0;
		System.arraycopy(arr,pos-1,arr,pos,arr.length);
		}
		else{
		System.out.println("Position not found");
		}
	}
	
	public void Update(int pos,int elToUpdate){
		if(pos>arr.length){
			System.out.println("Elements can not be updated");
		}
		else{
			arr[pos-1]= elToUpdate;
		}
		
	}

	public void Display(){
		for(int i=0;i<el;i++){
			System.out.println(arr[i]);
		}
	}
	
	public void LinearSearch(int elToSearch){
		for(int i:arr){
			if(i==elToSearch){
				System.out.println("Element found");
				break;
			}
		}
	}
	public void BinarySeach(int elToSearch){
		int first = 0;
		int last = arr.length-1;
		int mid = 0;
		while(first<=last){
			mid = first+lat/2;
			if(arr[mid]==x){
				System.out.println("Element found");
			}
			if(x>arr[mid]){
				first = mid+1;
			}
			if(x<arr[mid]){
				last = mid-1;
			}
		}
	}

	public void BubbleSort(){
		//now we will iterate through every other element of array to check which is smaller and changes its position with the next one
        //using for loop
        for (int i=0;i<arr.length-1;i++){
            //it will run one less than the length of array
            for(int j=0;j<arr.length-1-i;j++){
                //it will decrease the length of array as it starts sorting right side elements
                if(arr[j]>arr[j+1]){
                    //if the first element is greater than the second element than this condition will run and changes the position of 
                    //element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
	}
	
	public void SelectionSort(){
		//we use first loop to replace the characters
        for(int i = 0; i<arr.length-1;i++){
            //we make a variable so that we can remember the position of the smallest number in array
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                //using this one-forward loop to check the smallest number on which position 
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                    //remembers the position
                }
            }
            //replaces the number on specific position
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex] = temp;
        }
	}
	
	public void QuickSort(){
		
	}
	
	public void MergeSort(){
		
	}

}