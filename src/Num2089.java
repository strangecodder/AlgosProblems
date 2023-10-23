import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Num2089 {
//    public List<Integer> targetIndices(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0;i<nums.length;i++){
//            if(nums[i]==target){
//                listAns.add(i);
//            }else if(nums[i]>target){
//                break;
//            }
//        }
//        return listAns;
//    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] array = new int[]{0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(array)));
    }
}
