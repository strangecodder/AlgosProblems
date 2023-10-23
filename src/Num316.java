import java.util.HashSet;

public class Num316 {

    public static String removeDuplicateLetters(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(hashSet.add(s.charAt(i))){
                hashSet.add(s.charAt(i));
            }
        }
        char[] array = new char[hashSet.size()];

        int i = 0;

        for (char symb:hashSet) {
            array[i++]=symb;
        }
        String ans = new String(array);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
    }
}
