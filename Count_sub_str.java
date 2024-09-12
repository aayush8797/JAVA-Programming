public class Count_sub_str {
    public static int countSubstrings(String S) {
        int n = S.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String S = "abcab";
        System.out.println(countSubstrings(S)); 
    } 
}
