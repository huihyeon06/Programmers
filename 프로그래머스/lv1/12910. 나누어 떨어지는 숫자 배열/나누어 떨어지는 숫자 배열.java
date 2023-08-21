import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer.add(arr[i]);
            }
        }
        Collections.sort(answer);
        if(answer.size()==0){
            answer.clear();
            answer.add(-1);
        }
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i]=answer.get(i);
        }
        return result;
    }
}