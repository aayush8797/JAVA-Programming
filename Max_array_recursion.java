public class Max_array_recursion {
    public static int max(int arr[],int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int smallAns = max(arr, i+1);
        return Math.max(arr[i],smallAns);
    }
    public static void main(String[] args) {
        int arr[] = {92,87,76,99,40};
        int i=0;
        System.out.print(max(arr, i));
    }
}
