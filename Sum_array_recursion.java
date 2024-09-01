public class Sum_array_recursion {
    public static int sum(int arr[],int i){

        if(i==arr.length-1){
            return arr[i];
        }

        int Sum ;
        Sum = arr[i] + sum(arr, i+1);
        return Sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-9};
        int i=0;
        System.out.print(sum(arr, i));
    }
}
