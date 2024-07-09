import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            if(num == 2){
                System.out.println("it is a prime number.");
            }
            else{
                boolean prime =true;
                int i = 2;
                while (i*i < num) {
                    if (num%i == 0){
                        prime = false;
                    }
                    i = i+1;
                }
                if (prime==true) {
                    System.out.println("it is a prime number.");
                }
                else{
                    System.out.println("it is not a prime number.");
                }
            
            
            }
        }
    }
}
