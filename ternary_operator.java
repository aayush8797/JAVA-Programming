import java.util.*;
public class ternary_operator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();
            String status = (marks > 33) ? "Pass" : "Fail" ;
            System.out.println(status);
        }
    }
}
