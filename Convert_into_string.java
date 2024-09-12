public class Convert_into_string {
    static final String[] DIGITS = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static String numberToWords(int number) {
        if (number < 10) {
            return DIGITS[number];
        }
        return numberToWords(number / 10) + " " + DIGITS[number % 10];
    }

    public static void main(String[] args) {
        int number = 2019;
        System.out.println(numberToWords(number));
    }
}
