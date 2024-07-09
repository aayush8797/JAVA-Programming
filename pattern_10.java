import java.util.*;
public class pattern_10{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            char count ='A';
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    if (i>=j){
                        System.out.print(count+"  ");
                        count ++;
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
