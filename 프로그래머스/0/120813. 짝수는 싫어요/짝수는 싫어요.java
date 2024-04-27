class Solution {
    public int[] solution(int n) {
        int l;
        if(n%2==0){
            l=n/2;
        }else{
            l=n/2+1;
        }
        int[] answer = new int[l];
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer[cnt]=i;
                cnt++;
            }
        }
        return answer;
    }
}