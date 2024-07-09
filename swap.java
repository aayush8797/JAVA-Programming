import java.util.*;
public class swap {
    public static void swa(int a,int b){
        a=a+b; //13
        b=a-b; //5
        a=a-b; //8
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt(); //5
            int b = sc.nextInt(); //8
            swa(a,b);
            System.out.println(a); //5
        }
    }
}
