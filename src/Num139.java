import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int counter = 0;
        String helper = "";
        for(int i = 0;i<s.length();i++){
            helper+=s.charAt(i);
            if(wordDict.contains(helper)){
                counter++;
                helper="";
            }
        }
        return (counter>=wordDict.size())?true:false;
    }
}
