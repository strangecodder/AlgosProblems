public class Num779 {
    public static int helper(int pos, int k){
        if(pos == 4){
            pos = 1;
        }
        if(k==1){
            switch (pos){
                case 1: return 0;
                case 2: return 1;
                case 3: return 1;
                case 4: return 0;
            }
        }
        return helper(++pos,--k);
    }
    public static int kthGrammar(int n, int k) {
        return (n<k)?0:helper(1,k);
    }
    public static void main(String[] args) {
        System.out.println(kthGrammar(4,4));
    }
}
