import java.util.Arrays;

public class Num88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0; int pointer2 = 0;
        if(m==0){
            pointer1 = nums2.length;pointer2 = pointer1-n;
        }else pointer1=nums1.length; pointer2 = pointer1-n;
        int k = 0;
        for(int i = pointer2; i<pointer1;i++){
            if(nums1.length!=0) {
                nums1[i] += nums2[k];
                k++;
                }
            }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,0,0,0};
        int[] array2 = new int[]{2,5,6};
        merge(array1,6,array2,3);
        //1,2,3,0,0,0
        //2,5,6

        //1  || 1
        //   || 0
    }
}
