class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a;
        int mult=n*m;
        if(n<m){
            int tem=m;
            m=n;
            n=tem;
        }
        while(m!=0){
            a=n%m;
            n=m;
            m=a;
        }
        answer[0]=n;
        answer[1]=mult/n;
        return answer;
    }
}