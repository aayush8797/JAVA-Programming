import java.util.*;
public class pattern_15 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter rows:");
            int rows = sc.nextInt();
            for (int i=1; i<=rows; i++ ) { 
                for (int j=1; j<=rows - i; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=rows; j++) {
                   if((i==1) || (j==1) || (i==rows) || (j==rows)){
                    System.out.print("* "); 
                   }
                   else{
                    System.out.print("  ");
                   }
                }
                System.out.println("  ");
            }
        }
    }
}

