public class Num8 {

    public static int myAtoi(String s) {
        int num = 0;
        int dothen = 0;
        int sign = 1;
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num *= 10;
                num+=Character.getNumericValue(s.charAt(i));
                dothen++;
            }else if (s.charAt(i)=='-'){
                sign = -1;
            }
        }
        return num*sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
