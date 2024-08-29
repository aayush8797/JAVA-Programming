public class count_recursion {
    public static int add(int n){
        if(n==0){
            return 0;
        }
        int count = 1+add(n/10);
        return count;
    }
    public static void main(String[] args) {
        int n =10; 
        System.out.println(add(n));
    }
}
