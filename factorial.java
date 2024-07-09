import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            int fact = 1;
            for (int i=1; i<=num; i++){
                fact = fact*i;
            }
            System.out.println("The factorial of " + num + " is : " + fact);
        }
    }
}
