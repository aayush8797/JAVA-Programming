import java.util.*;
public class calculator{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b:");
            int b = sc.nextInt();
            System.out.print("Which operation do you want to perform:");
            String ch = sc.next();
            switch(ch) {
                case "add" -> System.out.println("The sum is "+ (a+b));
                case "subtract" -> System.out.println("The difference is "+ (a-b));
                case "multiply" -> System.out.println("The product is "+ (a*b));
                case "divide" -> System.out.println("The division is "+ (a/b));
                case "modulus" -> System.out.println("The remainder is "+ (a%b));
                default -> System.out.println("You choose default Operation");
            }
        }
    }
}
