import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        answer = new String[list.size()];
        Collections.sort(list);
        for(int i=0; i<strings.length; i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }
}