import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack();
        Stack<Character> stackT = new Stack();
        for(int i = 0, j =0;i<s.length()||j<t.length();i++,j++){
            if(i<s.length()){
                if(s.charAt(i)=='#'&&!stackS.empty()) stackS.pop();
                else if(s.charAt(i)!='#')stackS.push(s.charAt(i));
            }

            if(j<t.length()){
                if(t.charAt(i)=='#'&&!stackT.empty()) stackT.pop();
                else if(t.charAt(i)!='#')stackT.push(t.charAt(i));
            }
        }
        System.out.println(stackS+" "+stackT);
        while(!(stackS.empty() && stackT.empty())){
            char chS =' ';
            char chT = ' ';
            if(!stackS.empty()){
                chS = stackS.pop();
            }
            if(!stackT.empty()){
                chT = stackT.pop();
            }
            if(chS!=chT) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }
}