public class unary_operators {
    public static void main(String[] args) {
        // pre increment
        int a= 10;
        int b= ++a;
        System.out.println(a); //11
        System.out.println(b); //11

        // post increment
        int c= 15;
        int d= c++;
        System.out.println(c); //16
        System.out.println(d); //15

        // pre decrement
        int e= 19;
        int f= --e;
        System.out.println(e); //18
        System.out.println(f); //18

        // pre decrement
        int g= 39;
        int h= g--;
        System.out.println(g); //38
        System.out.println(h); //39

    }
}
