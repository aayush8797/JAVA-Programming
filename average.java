import java.util.*;

public class average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float avg =  (a + b + c)/3;
            System.out.println("The average is:" + avg) ;
        }

    }
}