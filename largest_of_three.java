import java.util.*;
public class largest_of_three{
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a>b && a>c) {
                System.out.println("a is largest");
            }
            else if(b>c && b>a) {
                System.out.println("b is largest");
            }
            else {
                System.out.println("c is largest");
            }
        }
    }
}
