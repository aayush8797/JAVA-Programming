public class Search_recursion {
    public static boolean sum(int arr[],int i ,int x){
        if(i==arr.length){
            return false;
        }
        if(arr[i] == x){
            return true;
        }
        return sum(arr, i+1, x);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-9};
        int i=0;
        int x=5;
        boolean ans = sum(arr, i , x);
        if(ans == false){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
