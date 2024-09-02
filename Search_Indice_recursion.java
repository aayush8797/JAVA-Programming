public class Search_Indice_recursion{
    public static void sum(int arr[],int i ,int x){
        if(i==arr.length){
            return; 
        }
        if(arr[i] == x){
            System.out.print(i+" ");
        }
        sum(arr, i+1, x);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,-9,2};
        int i=0;
        int x=2;
        sum(arr, i, x);
    }
}