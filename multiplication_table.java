import java.util.*;
public class multiplication_table {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            int product;
            for (int i=1; i<=10; i++){
                product = num * i;
                System.out.println(num + " * " + i + " = " + product);
            }
        }
    }
}
