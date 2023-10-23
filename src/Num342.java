public class Num342 {


    public static boolean isPowerOfFour(int n) {
        if(n==4||n==1) return true;
        else if(n<16 || n%2!=0) return false;
        return isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(18));
    }
}
