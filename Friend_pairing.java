public class Friend_pairing {
    public static int frnd_pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = frnd_pair(n-1);
        int pair = (n-1)*frnd_pair(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(frnd_pair(n));
    }
}
