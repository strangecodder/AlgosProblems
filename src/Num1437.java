public class Num1437 {

    public static boolean kLengthApart(int[] nums, int k) {
        int pointer = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==1){
                if(pointer<k&&i>0){
                    return false;
                }
                pointer=0;
            }else {
                pointer++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,0,0,1,0,1};
        System.out.println(kLengthApart(array,2));
    }
}
