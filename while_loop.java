import java.util.*;
public class while_loop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i=0;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            while(i<num){
                System.out.println("ASR");
                i++;
            }
        }
    }
}
