public class Sum_recursion {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        sum(n-1);
        int ans = n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
