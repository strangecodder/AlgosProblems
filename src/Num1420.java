public class Num1420 {

    public static int factorial(int n){
        if (n==0) return 1;
        return n * factorial(n-1);
    }

    public static int  numOfArrays(int n, int m, int k) {
        if(m==k) return k;
        if(m>k){
            return factorial(m)/factorial(m-n);
        }

            return 0;
    }

    public static void main(String[] args) {
        //System.out.println(factorial(3));
        System.out.println(numOfArrays(2,3,1));
    }
}
