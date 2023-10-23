import java.util.Arrays;
import java.util.Scanner;

public class Num281A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String reg = in.nextLine();
        int[] array = new int[reg.length()/2+1];
        int k = 0;
        for(int i = 0;i<reg.length();i++){
            if(reg.charAt(i)!='+'){
                array[k] = Integer.parseInt(String.valueOf(reg.charAt(i)));
                k++;
            }
        }
        Arrays.sort(array);
        String newString = "";
        for(int i = 0; i<array.length;i++){
            newString+=String.valueOf(array[i]);
            if(i!= array.length-1) newString+="+";

        }

        System.out.println(newString);
    }
}
