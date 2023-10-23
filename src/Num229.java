import java.util.*;

public class Num229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet();
        Arrays.sort(nums);
        int number = 0; int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=number) {
                number = nums[i];
                count = 0;
            }
            if(nums[i]==number){
                count++;
            }
            if(count>nums.length/3 && set.add(number)==true){
                list.add(number);
                set.add(number);
                count = 0;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(majorityElement(array));
    }
}
