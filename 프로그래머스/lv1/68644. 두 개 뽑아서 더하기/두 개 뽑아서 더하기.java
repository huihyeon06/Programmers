import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(i!=j)
                    result.add(numbers[i]+numbers[j]);
            }
        }
        ArrayList<Integer> answer = new ArrayList<Integer>(result);
        Collections.sort(answer);
        int[] r = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            r[i] = answer.get(i);
        }
        return r;
    }
}