import java.util.*;
public class pattern_7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i =1;i<=num;i++){
                for (int j=1;j<=num;j++){
                    if ((((j-i)<=((num-1)/2)) && ((j-i)>=((-num+1)/2))) && (((i+j)>(num-((num-1)/2))) && ((i+j)<=(num+((num+1)/2))))){
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
