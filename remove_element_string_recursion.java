public class remove_element_string_recursion {
    public static String remove(String str,int i){
        if(i ==str.length()){
            return "";
        }
        String SmallAns = remove(str, i+1);
        char CurrChar = str.charAt(i);

        if(str.charAt(i)!='a'){
            return CurrChar+SmallAns;
        }
        else{
            return SmallAns;
        }
    }
    public static void main(String[] args) {
        String str = "Aayush";
        System.out.println(remove(str, 0));
    }
}
