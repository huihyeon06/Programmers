import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer={};
        int min=arr[0], min_index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        list.remove(min_index);
        if(list.isEmpty()){
            answer=new int[1];
            answer[0]=-1;
        }else{
            answer=new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i]=list.get(i);
            }
        }
        
        
        return answer;
    }
}