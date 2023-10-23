import java.util.HashMap;

public class Num3 {

    public static boolean isContains(String string,char ch){
        if(string.length()==0) return false;
        for(int i = 0;i<string.length();i++){
            if(string.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }

    public static boolean isUnique(String string){
        HashMap<Character,Character> map = new HashMap<>();
        boolean flag = true;
        for(int i = 0;i<string.length();i++){
            if(map.containsKey(string.charAt(i))) {
                return false;
            }
            map.put(string.charAt(i),string.charAt(i));
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Integer,String> map = new HashMap();
        if(s.length()==0) return 0;
        map.put(1,String.valueOf(s.charAt(0)));
        boolean flag = false;
        String string ="";
        if(isUnique(s)) return s.length();
        for (int i = 0;i<s.length()-1;i++) {
            if(!isContains(string,s.charAt(i))) string+=s.charAt(i);

            if(isContains(string,s.charAt(i+1))){
                if(string.length()>map.get(1).length()) map.put(1,string);
                string="";
                string+=s.charAt(i);
            }else if(string.length()>map.get(1).length()){
                map.put(1,string);
            }
        }
        if(!isContains(string,s.charAt(s.length()-1))){
            if(string.length()>map.get(1).length()) {
                string += s.charAt(s.length() - 1);
                map.put(1, string);
            }
        }
        if(string.length()>map.get(1).length())map.put(1,string);
        return map.get(1).length();
    }
//            if(!isContains(string,s.charAt(i))){
//                string+=s.charAt(i);
//                if(!flag){
//                    map.put(1,string);
//                }
//            }else{
//                if(string.length()>map.get(1).length()){
//                    map.put(1,string);
//                }
//                flag=true;
//                string="";
//                string+=s.charAt(i);
//            }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
