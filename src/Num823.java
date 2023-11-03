import java.util.Arrays;
import java.util.HashMap;

public class Num823 {

    public static int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap();
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],arr[i]);
            for(int j = i;j>=0;j--){
                if(map.containsKey(arr[i]/arr[j])&&arr[i]%arr[j]==0){
                    sum++;
                }
            }
        }
        return arr.length +sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{18,3,6,2};
        System.out.println(numFactoredBinaryTrees(array));
    }
}
