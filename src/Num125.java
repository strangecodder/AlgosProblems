public class Num125 {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int point1 = 0; int point2 = s.length()-1;
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(point1)!=s.charAt(point2)) return false;
            point1++;
            point2--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
