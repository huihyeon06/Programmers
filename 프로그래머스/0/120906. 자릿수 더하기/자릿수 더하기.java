class Solution {
    public int solution(int n) {
        int answer=0;
        int i=10;
        while(n>0){
            answer+=n%i;
            n/=i;
        }
        return answer;
    }
}