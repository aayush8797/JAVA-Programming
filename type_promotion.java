public class type_promotion {
    public static void main(String[] args) {
        /* java automatically promote each byte,
         * short, or char operand to 'int' without 
         * evaluating an expressions.
         */
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);

        /* if one of the operand is long, float,or
         * double the whole expression is promoted 
         * to long , float or double respt.
         */
        int r = 10 ;
        float s = 20.9f ;
        long c= 56;
        double d= 67;
        double ans=r+s+c+d;
        System.out.println(ans);

    }
}
