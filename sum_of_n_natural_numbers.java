import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i=1;
            int sum = 0;
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            while(i<=num){
                sum = sum+i;
                i++;
            }
            System.out.println("Sum is : " + sum);
        }
    }
}
