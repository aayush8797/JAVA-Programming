import java.util.*;
public class print_1to10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i=1;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            while(i<=num){
                System.out.println(i);
                i++;
            }
        }
    }
}

