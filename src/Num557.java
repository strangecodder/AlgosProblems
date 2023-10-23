public class Num557 {
    public static String reverseWord(String s){
        String newS = "";
        for(int i = s.length()-1; i>=0;i--){
            newS+=s.charAt(i);
        }
        return newS;
    }

    public static String reverseWords(String s) {
        String word = ""; String totalAnswer = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                totalAnswer+=reverseWord(word);
                totalAnswer+=" ";
                word = "";
            }else{
                word+=s.charAt(i);
            }
            if(i==s.length()-1){
                totalAnswer+=reverseWord(word);
            }
        }
        return totalAnswer;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
