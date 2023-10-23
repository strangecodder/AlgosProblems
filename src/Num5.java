import java.util.HashMap;

public class Num5 {
    public static boolean isPalindrome(String s){
        int left = 0; int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        HashMap<Integer,String> map = new HashMap();
        int max = 0;
        map.put(0,"");
        if(s.length()==1) return s;
        for(int i = 0;i<s.length();i++){
            String sub = "";
            for(int j = i;j<s.length();j++){
                sub+=s.charAt(j);
                if(isPalindrome(sub)){
                    if(sub.length()>max){
                        max = sub.length();
                        map.put(max,sub);
                    }
                }
                if(max==s.length()) break;
            }

        }
        return map.get(max);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
    }
}
