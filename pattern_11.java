import java.util.*;
public class pattern_11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a row: ");
            int num_1= sc.nextInt();
            System.out.print("Enter a column: ");
            int num_2= sc.nextInt();
            for (int i =1;i<=num_1;i++){
                for (int j=1;j<=num_2;j++){
                    if (((i==1) || (i==num_1))){
                        System.out.print("*");
                    }
                    else if(((j==1) || (j==num_2))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
