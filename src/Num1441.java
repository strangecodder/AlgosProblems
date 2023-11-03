import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num1441 {

    public static List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack();
        List<String> list = new ArrayList();

        int count = 1;
        int j =0;
        while(n>0){
            stack.push(count);
            list.add("Push");
            if(stack.peek()!=target[j]){
                list.add("Pop");
                j--;
            }
            j++;
            count++;
            n--;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},3));
    }

}
