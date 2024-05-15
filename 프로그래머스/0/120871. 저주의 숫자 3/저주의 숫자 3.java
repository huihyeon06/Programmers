class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            cnt++;
            while(cnt%3==0 || Integer.toString(cnt).contains("3")){
                cnt++;
            }
        }
        return cnt;
    }
}