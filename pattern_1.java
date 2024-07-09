import java.util.*;
public class pattern_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}
