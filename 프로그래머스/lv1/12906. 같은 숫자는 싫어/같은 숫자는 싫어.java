import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
        arrlist.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arrlist.add(arr[i]);
            }  
        }
        int answer[]=new int[arrlist.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrlist.get(i);
        }
        return answer;
    }
}