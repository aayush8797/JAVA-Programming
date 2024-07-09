import java.util.*;
public class break_s{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            for(i=1;i<=num;i++){
                if (i==5){
                    break;
                }
                System.out.println(i);
            }
        }
    }
}