public class Num896 {
    public static boolean isMonotonic(int[] nums) {
        int isRaise = 0;
        if(nums[0]<=nums[1]){
            isRaise = 1;
        }
        for(int i = 1;i<nums.length-1;i++){
            switch(isRaise){
                case 1:
                    if(nums[i]>nums[i+1]){
                        return false;
                    }
                    break;
                case 0:
                    if(nums[i]<=nums[i+1]){
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,2};
        System.out.println(isMonotonic(test));

    }
}
