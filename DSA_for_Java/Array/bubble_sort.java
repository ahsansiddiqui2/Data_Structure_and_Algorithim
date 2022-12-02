class bubble_sort{
    public static void main(String[] args) {
        //bubble sort
        // to sort an array by changing position
        //suppose an array as:
        int [] arr = {10,2,8,7,6,3};
        
        for (int i : arr) {
            System.out.print(i);
            
        }
        System.out.println();
        //above loop will show the result of unsorted array

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
        for (int i : arr) {
            System.out.print(i);
            
        }
        //above loop shows the result of sorted array
        
    }
}