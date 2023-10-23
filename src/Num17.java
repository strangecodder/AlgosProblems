import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num17 {

    public static List<String> letterCombinations(String digits) {
        HashMap<String,String> map = new HashMap();
        List<String> list = new ArrayList();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        String s1 =null,s2=null,s3=null,s4 =null;
        if(digits.length()==0) {
            return list; //empty list
        }
        if(digits.length()>=1){
            s1 = String.valueOf(digits.charAt(0));
        }
        if(digits.length()>=2){
            s2 = String.valueOf(digits.charAt(1));
        }
        if(digits.length()>=3){
            s3 = String.valueOf(digits.charAt(2));
        }
        if(digits.length()>=4){
            s4 = String.valueOf(digits.charAt(3));
        }
        for(int i = 0;i<map.get(s1).length();i++){
            String answer = String.valueOf(map.get(s1).charAt(i));
            if(s2==null) list.add(answer);
            else {
            for(int j =0;j<map.get(s2).length();j++) {
                String h2 = answer +String.valueOf(map.get(s2).charAt(j));
                if (s3 == null) list.add(h2);
                else {
                    for (int k = 0; k < map.get(s3).length(); k++) {
                       String h3 =  h2 + String.valueOf(map.get(s3).charAt(k));
                        if (s4 == null) list.add(h3);
                        else {
                            for (int m = 0; m < map.get(s4).length(); m++) {
                                String h4 =h3 + String.valueOf(map.get(s4).charAt(m));
                                list.add(h4);
                            }
                        }
                    }
                }
            }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("5678"));
    }
}
