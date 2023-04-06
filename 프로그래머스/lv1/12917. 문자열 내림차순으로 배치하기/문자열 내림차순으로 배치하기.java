import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray(); //s를 char타입으로 변환
        Arrays.sort(ch); //ch를 정렬
        answer=new StringBuilder(new String(ch)).reverse().toString();
        
        return answer;
    }
}