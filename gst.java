import java.util.*;
public class gst {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();
            float total_cost = pencil + pen + eraser;
            float bill = total_cost+((total_cost*18)/100);
            System.out.println(bill);
            
            // Names of variables are called identifiers in Java. Identifier rule
            // says,identifiers can start with any alphabet or underscore (“_”) or
            //  dollar (“$”).According to the rule the given variable name is a valid identifier.
            int $=24;
            System.out.println($);

        }
    }
}
