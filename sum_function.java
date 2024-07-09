import java.util.Scanner;
public class sum_function {
    public static int sum(int x, int y){ // parameters or Formal parameters
        return x+y;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x =sc.nextInt();
            int y = sc.nextInt();
            int result = sum(x,y); //Arguments or Actual parameter
            System.out.println(result);
        } 
    }
}
