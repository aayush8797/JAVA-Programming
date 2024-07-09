import java.util.*;
public class pattern_13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    if (i>=j){
                        if((i+j)%2==0){
                            System.out.print("1 ");
                        }
                        else{
                            System.out.print("0 ");
                        }
                    }
                }
                System.out.println(" ");
            }
        }
    }
}