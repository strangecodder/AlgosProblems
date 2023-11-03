import java.util.HashMap;

public class Num334 {

    public static boolean increasingTriplet(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
            int maxValue = nums[i];
            for(int j = i; j<nums.length;j++){
                if(nums[j]>maxValue){
                    map.put(nums[j],j);
                    maxValue = nums[j];
                }
                if(map.size()==3) return true;
            }
            map.clear();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,5,0,4,1,3}));
    }
}
