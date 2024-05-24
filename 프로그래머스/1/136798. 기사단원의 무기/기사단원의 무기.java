import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int number, int limit, int power) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=number; i++){
            int cnt=0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    cnt++;
                    if(j!=i/j){
                        cnt++;
                    }
                }
            }
            list.add(cnt);
        }
        Integer[] arr = list.toArray(new Integer[list.size()]);
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>limit){
                arr[i]=power;
            }
            sum+=arr[i];
        }
        
        return sum;
    }
}