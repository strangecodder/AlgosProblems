import java.util.HashSet;

public class Num1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[mat.length];
        for(int i = 0; i<mat[0].length;i++){
            for(int j = 0; j<mat[i][j];j++){
                if(mat[i][j]==1){
                    ans[i]++;
                }
            }
        }
        int[] newArray = new int[k];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<k;i++){
            int min = ans[i];
            for(int j = 0;j<ans.length;j++){
                if(ans[j]!=-1){
                    if(min>ans[j]){
                        min = j;
                    }
                }
            }
            newArray[i] = min;
            ans[min] = -1;
        }
        return newArray;
    }

    public static void main(String[] args) {

    }
}
