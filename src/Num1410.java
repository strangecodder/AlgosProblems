import java.util.HashMap;

public class Num1410 {
    public static String entityParser(String text) {
        HashMap<String,String> map = new HashMap();
        // String answer = "";
        // String parser = "";
        map.put("&quot;","\"");
        map.put("&apos;","\'");
        map.put("&amp;","&");
        map.put("&gt;",">");
        map.put("&lt;","<");
        map.put("&frasl;","/");

        String[] answer = new String[2];
        answer[0]="";
        answer[1]="";
        int answerIndex = 0;
        for(int i = 0;i<text.length();i++){
            if(text.charAt(i)=='&'){
                if(answer[1].length()!=0&&answer[0].charAt(0)=='&'){
                    answer[1] += answer[1];
                    answer[0]="";
                }else {
                    answerIndex = 1;
                }
                }
            answer[answerIndex]+=text.charAt(i);
            if(text.charAt(i)==';'){
                answerIndex = 0;
                if(map.containsKey(answer[1])){
                    answer[answerIndex]+=map.get(answer[1]);
                }else{
                    answer[answerIndex]+=answer[1];
                }
                answer[1] = "";
            }
        }
        return answer[0];
    }

    public static void main(String[] args) {
        System.out.println(entityParser("&&gt;"));
    }
}
