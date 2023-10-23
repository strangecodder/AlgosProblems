import java.util.Arrays;
import java.lang.Math;

public class Num905 {
    public static int[] sortArrayByParity(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0; j<nums.length-1;j++){
                if(nums[i]%2!=0&&nums[i]!=0){
                    int a = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = a;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        //int[] array = new int[]{0,1};
        //System.out.println(Arrays.toString(sortArrayByParity(array)));
        System.out.println((double) 1+2.4*(Math.pow(710/1320,0.09)-1));
        System.out.println((double) 1+2.4*(Math.pow(710/2240,0.09)-1));
    }
}
