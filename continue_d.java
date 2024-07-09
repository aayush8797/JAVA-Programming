import java.util.Scanner;

public class continue_d {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            for(i=1;i<=num;i++){
                if (i%2==0){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
    
}
