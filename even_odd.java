import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();

            if (num %2 ==0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
    }
}
