import java.util.*;
public class reverse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            for(i=num;i>=1;i--){
                System.out.println(i);
            }
        }
    }
} 