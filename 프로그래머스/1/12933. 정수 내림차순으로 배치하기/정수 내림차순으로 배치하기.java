import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<Long>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
        answer+=list.get(0);
        for(int i=1; i<list.size(); i++){
            answer= answer * 10 + list.get(i);
        }
        return answer;
    }
}