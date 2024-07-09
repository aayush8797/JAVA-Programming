public class type_conversion {
    public static void main(String[] args) {
        // byte->short->int->float->long->double
        // destination type -> source type
        // small data type can be converted into big data type
        // But if converted big data type into small it throughs an error  
        int marks = 56;
        float con = marks;
        System.out.println(con);
        // it is simply known as "Widening Conversion"
        // implicit conversion
    }
}
