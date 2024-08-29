public class Sum_of_digits_recursion {
    public static int add(int n){
        if(n<=9 && n>=0){
            return n;
        }
        int sum = n%10;
        sum += add(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n = 312489; 
        System.out.println(add(n));
    }
}
