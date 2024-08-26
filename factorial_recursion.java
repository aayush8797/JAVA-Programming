public class factorial_recursion{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f = fact(n-1);
        int ans = n*f;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
