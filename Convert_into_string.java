public class Convert_into_string {
    static final String[] DIGITS = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    // Recursive function to convert number to words
    public static String numberToWords(int number) {
        // Base case: if the number is a single digit
        if (number < 10) {
            return DIGITS[number];
        }
        // Recursive case: process the last digit and call the function for the rest of the number
        return numberToWords(number / 10) + " " + DIGITS[number % 10];
    }

    public static void main(String[] args) {
        int number = 2019;
        System.out.println(numberToWords(number));
    }
}
