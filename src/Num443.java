import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num443 {

    public static int compress(char[] chars) {
        List<Character> list = new ArrayList();
        HashMap<Character,Integer> map = new HashMap();
        int leftPointer = 0;
        int rightPointer = 0;
        for(int i = 0;i<chars.length;i++){
            if(chars[leftPointer]!=chars[rightPointer]){
                if(map.get(chars[leftPointer])>1)
                {
                    String num = String.valueOf(map.get(chars[leftPointer]));
                    for(int j = 0;j<num.length();j++)
                    {
                        list.add(num.charAt(i));
                    }
                }
                leftPointer=rightPointer;
            }
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
                list.add(chars[i]);
            }else{
                int count = map.get(chars[i])+1;
                map.put(chars[i],count);
            }
            rightPointer++;
        }
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
    }
}
