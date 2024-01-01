class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int eaten = 0;
        
        while(chicken>=10){
            eaten = chicken/10;
            answer +=eaten;
            chicken = chicken%10+eaten;
            
        }
        return answer;
    }
}