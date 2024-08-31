public class GCD2_recursion {
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int x = 18 ;
        int y = 24;
        System.out.print(gcd(x, y));
    }
}   
