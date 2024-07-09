import java.util.*;
public class product_using_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = a*b;
            System.out.println(product);
        }
    }
}
