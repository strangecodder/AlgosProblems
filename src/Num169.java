import java.util.Arrays;
public class Num169 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int number = nums[0];
        for(int i = 0;i<nums.length;i++){
            count++;
            if(nums[i]!=number){
                if(count>nums.length/2) break;
                else{
                    count = 0;
                    number = nums[i];
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] test = new int[]{-1,1,1,1,2,1};
        System.out.println(majorityElement(test));
    }
}
