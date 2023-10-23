package tasks_from_videos;

import com.sun.source.tree.BinaryTree;

import java.util.Arrays;
import java.util.TreeMap;

/*Дан массив x длинной N (упорядоченный)
* необходимо вернуть массив квадратов
* по возрастанию
* [-3,2,4]->[4,9,16]
*
* [-3,-1,1,4,5] ->[0,0,0,0,0]
* */
public class YandexMassive {

    public static int[] doubleArrays(int[] array){
        int[] answer = new int[array.length];
        int left = 0;
        int right = array.length-1;
        while (right!=left){
            if(Math.abs(array[left])>=Math.abs(array[right])){
                int b = array[right];
                array[right] = array[left]*array[left];
                array[left] = b*b;
                right--;
            }else {
                array[right] = array[right]*array[right];
                right--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-3,2,4};
        System.out.println(Arrays.toString(doubleArrays(array)));
    }
}
