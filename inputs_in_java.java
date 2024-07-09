import java.util.*;
public class inputs_in_java {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String input = s.nextLine();
            System.out.println(input);
            Boolean a= s.nextBoolean();
            System.out.println(a);
            int b= s.nextInt();
            System.out.println(b);
            Float c= s.nextFloat();
            System.out.println(c);
        }
    }
}
