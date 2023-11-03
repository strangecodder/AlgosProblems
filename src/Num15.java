import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left!=right){
            List<Integer> preAnsw = new ArrayList<>();
            preAnsw.add(nums[left]);//indexes
            preAnsw.add(nums[right]);
            for(int i = left+1;i<right;i++){
                if((nums[left]+nums[right])+nums[i]==0){
                    preAnsw.add(1,nums[i]);
                    if(!answer.contains(preAnsw)){
                        answer.add(preAnsw);
                    }

                    right--;
                    break;
                }
            }
            if(preAnsw.size()!=3){
                left++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //[-4,-1,-1,0,1,2]
        int[] array = new int[]{0,0,0,0};
        System.out.println(threeSum(array));
    }
}
