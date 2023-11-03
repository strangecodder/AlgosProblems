import java.util.*;

public class Num501 {
    //Class for try find max map value

    public static int[] findMaxMapValue(HashMap<Integer,Integer> map){
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int key:map.keySet()) {
            if(map.get(key)>max){
                max = map.get(key);
                list.clear();
                list.add(map.get(key));
            }else if(map.get(key)==max){
                list.add(key);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(4,2);
        System.out.println(Arrays.toString(findMaxMapValue(map)));
    }
}
