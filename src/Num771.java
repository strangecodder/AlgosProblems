import java.util.Hashtable;

public class Num771 {

    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        Hashtable<Character,Character> hashtable = new Hashtable();
        for(int i = 0; i<jewels.length();i++){
            if(!hashtable.contains(jewels.charAt(i))){
                hashtable.put(jewels.charAt(i),jewels.charAt(i));
            }
        }
        for(int i=0;i<stones.length();i++){
            if(hashtable.contains(stones.charAt(i))) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
