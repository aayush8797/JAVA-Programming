public class LCM_recursion {
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static int lcm(int x,int y){
        int Lcm = (x*y)/gcd(x, y);
        return Lcm;
    }
    public static void main(String[] args) {
        int x = 18 ;
        int y = 24;
        
        System.out.println(lcm(x, y));
    }
}
