import java.util.*;
public class pattern_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    if ((i+j) <= (num+1)) {
                        System.out.print("* ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
