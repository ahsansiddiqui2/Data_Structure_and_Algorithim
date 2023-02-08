public class one {
    public static void main(String[] args) {
        int[] [] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.print("The left diagonal is :");
        LeftDiagonal(arr);
        System.out.print("Right diagonal is : ");
        RightDiagonal(arr);
    }
    public static void LeftDiagonal(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr.length;j++){
            if(i==j){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void RightDiagonal(int[][] arr){
        int sum=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][j];
        }
        System.out.println(sum);
    }
}
