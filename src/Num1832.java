import java.util.HashMap;

public class Num1832 {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i<sentence.length();i++){
            if(!map.containsKey(sentence.charAt(i))) map.put(sentence.charAt(i),sentence.charAt(i));
        }
        if(map.size()<27) return false;
            return true;
    }

    public static void main(String[] args) {

    }
}
