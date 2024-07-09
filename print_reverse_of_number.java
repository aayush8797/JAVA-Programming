import java.util.*;

public class print_reverse_of_number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            int reverse = 0;
            while(num>0){
                int s = num%10;
                reverse = (reverse*10) +s;
                num /= 10;
            }
            System.out.println(reverse);
        }
    }
} 
