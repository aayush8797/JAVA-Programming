public class print_array_recursion {
    public static void print(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        print(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,6,9,40};
        int i=0;
        print(arr,i);
    }
}
