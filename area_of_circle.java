import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            float radius = s.nextFloat();
            float area = 3.14f * radius * radius ;
            System.out.println(area);
        }
    }
}