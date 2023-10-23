import java.util.Arrays;
public class Num410 {

    public static int splitArray(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i>k;i++){
            sum+=nums[nums.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7,2,5,10,8};
        System.out.println(splitArray(array,2));
    }
}
