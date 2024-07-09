import java.util.*;
public class switch_case{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            switch(num) {
                case 1 -> System.out.println("samosa");
                case 2 -> System.out.println("Burger");
                case 3 -> System.out.println("Mango");
                case 4 -> System.out.println("Sting");
                case 5 -> System.out.println("Gulab jamun");
                default -> System.out.println("We wake up");
            }
        }
    }
}
