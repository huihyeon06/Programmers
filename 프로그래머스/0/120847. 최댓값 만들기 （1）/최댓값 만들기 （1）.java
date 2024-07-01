import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]);
        }
        int max1 = Collections.max(list);
        list.remove(list.indexOf(max1));
        
        
        return max1*Collections.max(list);
    }
}