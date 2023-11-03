import java.util.Arrays;

public class Num1679 {

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==k){
                answer++;
                left++;
                right--;
            }else if(sum>k) right--;
            else left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
}
