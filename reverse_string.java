public class reverse_string {
    public static void reverse(String str,int i){
        if(i ==str.length()){
            return;
        }
        reverse(str, i+1);
        System.out.print(str.charAt(i)+" ");
        
    }
    public static void main(String[] args) {
        String str = "Aayush";
        reverse(str, 0);
    }
}
