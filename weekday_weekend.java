import java.util.*;
public class weekday_weekend {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number (1-7) : ");
            int day = sc.nextInt();

            switch(day) {
                case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
                case 6, 7 -> System.out.println("Weekend");
                default -> System.out.println("Invalid!");
            }
        }
    }
}
