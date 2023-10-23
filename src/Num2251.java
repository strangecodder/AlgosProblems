import java.util.Arrays;
import java.util.Hashtable;

public class Num2251 {
    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int[] solution = new int[people.length];

        for(int i = 0;i<people.length;i++){
            for(int j = 0; j<flowers.length;j++){
                if(people[i]>=flowers[j][0] && people[i]<=flowers[j][1]){
                    solution[i]++;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[][] flowers = new int[][]{{1,10},{3,3}};
        int[] people = new int[]{3,3,2};
        System.out.println(Arrays.toString(fullBloomFlowers(flowers,people)));

        //{1,6},{3,7},{9,12},{4,13}
        //2,3,7,11
    }
}
