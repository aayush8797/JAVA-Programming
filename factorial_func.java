import java.util.*;
public class factorial_func {
    public static int fact(int num,int fact){
        for(int i =1 ; i<=num ; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num =sc.nextInt();
            int fact = 1;
            System.out.println(fact(num,fact));
        }
    }
}
