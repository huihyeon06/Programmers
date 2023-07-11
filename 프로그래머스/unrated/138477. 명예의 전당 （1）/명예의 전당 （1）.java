import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++){
            if(temp.size()<k){
                temp.add(score[i]);
                Collections.sort(temp);
                answer[i]=temp.get(0);
                continue;
            }
            if(temp.size()==k){
                if(temp.get(0)<score[i]){
                    temp.remove(0);
                    temp.add(score[i]);
                    Collections.sort(temp);
                    answer[i]=temp.get(0);
                }else{
                    answer[i]=temp.get(0);
                }
            }
        }
        return answer;
    }
}