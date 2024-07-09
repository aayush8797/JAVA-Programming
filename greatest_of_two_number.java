import java.util.*;
public class greatest_of_two_number {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("a is greatest.");
            }
            else {
                System.out.println("b is greatest.");

            }
        }
    }
}