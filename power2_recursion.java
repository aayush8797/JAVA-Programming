public class power2_recursion {
    public static int Power(int p, int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            return Power(p, q/2)*Power(p,q/2);
        }
        return p*Power(p, q/2)*Power(p,q/2);
    }
    public static void main(String[] args) {
        System.out.println(Power(2,4));
    }
}
