public class AlternateSigns_sum_recursion {
    public static int sum(int num){
        if(num==0){
            return 0;
        }
        if(num%2==0){
            int ans = sum(num-1)-num;
            return ans;
        }
        int ans = sum(num-1)+num;
        return ans;
    } 
    public static void main(String[] args) {
        int num = 9;
        System.out.println(sum(num));
    } 
}
