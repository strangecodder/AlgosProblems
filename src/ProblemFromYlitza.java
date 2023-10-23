import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProblemFromYlitza {

    public static List<Integer> PairOfNums(int[] array,int sum){
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            hashMap.put(array[i],i);
            if(hashMap.containsKey(sum-array[i])){
                answer.add(hashMap.get(sum-array[i]));
                answer.add(i);
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = new int[]{6,9,3,8,1};
        System.out.println(PairOfNums(a,15));

    }
}
