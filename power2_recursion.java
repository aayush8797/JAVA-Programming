public class power2_recursion {
    public static int Power(int p, int q){
        if(q==0){
            return 1;
        }
        int halfpower = Power(p, q/2);
        if(q%2==0){
            return halfpower*halfpower;
        }
        return p*halfpower*halfpower;
    }
    public static void main(String[] args) {
        System.out.println(Power(2,4));
    }
}
