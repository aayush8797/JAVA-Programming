public class Multiples_recursion {
    public static void multiple(int num, int k){
        if(k == 1){
            System.out.print(num);
            return;
        }
        multiple(num, k-1);
        System.out.print(",");
        System.out.print(num * k);   
    } 
    public static void main(String[] args) {
        int num = 2;
        int k = 10;
        multiple(num, k);
    } 
}
