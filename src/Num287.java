import java.util.HashSet;

public class Num287 {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n:nums){
            if(set.contains(n)){
                return n;
            }
            set.add(n);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,1,3,2,4};
        System.out.println(findDuplicate(array));
    }
}
