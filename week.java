import java.util.*;
public class week {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter week number(1-7):");
            int week = sc.nextInt();
            switch(week) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("wednesday");
                case 4 -> System.out.println("Thrusday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("You choose default.");
                
            }
        }
    }
}
