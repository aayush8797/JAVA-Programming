import java.util.*;
public class area_of_square {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int side = sc.nextInt();
            int area= side*side;
            System.out.println("The area of square is:" + area);
        }
    }
}
