public class Num1221 {
    public static int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int totalSum = 0;
        for(int i = 0; i<s.length();i++){
            if(countR==0){
                if(s.charAt(i)=='R') countR++;
                else countL++;
            }else{
                if(s.charAt(i)=='R') countR++;
                else countL++;
                if(countR==countL){
                    countR=0;
                    countL=0;
                    totalSum++;
                }
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }
}
