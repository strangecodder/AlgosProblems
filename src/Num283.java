import java.util.Arrays;

public class Num283 {

    public static void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0; j<nums.length-1;j++){
                if(nums[j]==0){
                    int a = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j]=a;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,0,1};
        moveZeroes(array);
    }
}
