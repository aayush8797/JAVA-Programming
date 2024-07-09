public class type_casting {
    public static void main(String[] args) {
        /* we can convert big data type into small data types
        by type casting but some data will loss due to insufficient 
        storage in small data types */
        float marks = 94.99f;
        int b = (int) marks;
        System.out.println(b);
        char ch = 'a';
        int num= ch;
        System.out.println(num);
        // it is simply known as "Narrowing Conversion"
        // explicit conversion
    }
}
