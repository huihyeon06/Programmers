class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        int i=0;
        while(i<is_prefix.length()){
            if(is_prefix.length()>my_string.length()){
                answer=0;
                break;
            }
            if(is_prefix.charAt(i)!=my_string.charAt(i)){
                answer=0;
                break;
            }
            i++;
        }
        return answer;
    }
}