import java.util.*;
public class sum_of_even_and_odd {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number : ");
            int num =sc.nextInt();
            int even = 0;
            int odd =0;
            for (int i=1; i<=num ; i++){
                if (i%2==0){
                    even = even + i;
                }
                else{
                    odd = odd + i;
                }
            }
            System.out.println("The sum of even number is : " + even);
            System.out.println("The sum of odd number is : " + odd);
        }
    }
}
