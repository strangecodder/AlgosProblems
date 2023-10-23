public class Num29 {

    public static int divide(int dividend, int divisor) {
        boolean flag = true;
        int sign;
        if((dividend>0&&divisor>0) ||(dividend<0&&divisor<0)){
            sign = 1;
        }else{
            sign = -1;
        }
        int n = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if(divisor==1){
            if(dividend == Integer.MIN_VALUE && sign==1 ){
                return +dividend;
            }else {
                return dividend * sign;
            }
            }else {
            if(dividend==Integer.MIN_VALUE){
                n++;
                dividend--;
            }
            while (dividend >=divisor) {
                dividend -= divisor;
                n++;
            }
            return sign * n;
        }
    }


    public static void main(String[] args) {
//        System.out.println(divide(10,3));
//        System.out.println(divide(7,-3));
//        System.out.println(divide(1,1));
        System.out.println(divide(-2147483648,2));
}
}
