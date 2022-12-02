/**
 * selection_sort
 */
public class selection_sort {

    public static void main(String[] args) {
        //in this sort we sort from left to right unlike bubble sort
        //first find smallest and then replace it with the left most element 
        //as if we take an array :
        int [] arr = {0,1,8,6,7,3};

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        //array before sorting

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
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        //after results
    }
}