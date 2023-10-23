import java.util.Stack;

public class Num880 {
    public static String decodeAtIndex(String s, int k) {
        String newString = "";
        int count = 0;int index = s.length();
        int countRep = 0;
        boolean flag = true;
        String ans = "";
        int backup = index;int savedI = 0;
        for(int i = 0;i<index;i++){
            if(!flag){
                if(i==k){
                  ans+=s.charAt(i);
                  break;
                }
                count++;
                if(count==newString.length()){
                    count = 0;
                    countRep --;
                }
                if(countRep == 0){
                    flag = true;
                    index = backup;
                    i = savedI;
                    newString = "";
                    break;
                }
            }
            if(flag&& s.charAt(i)>'0'&&s.charAt(i)<='9'){
                countRep = Integer.valueOf(String.valueOf(s.charAt(i)));
                index +=countRep*newString.length();
                savedI = i;
                i--;

                flag = false;
            }else if(flag){
                newString+=s.charAt(i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3",  10));
    }
}
