import java.util.*;
public class pattern_12{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    if ((((i+j)<=(num+1)) && ((j-i)<=0)) || (((j-i)>=0) && ((i+j)>num))){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
