class Solution {
    public long solution(long n) {
        long answer = 0;
        double nn = Math.sqrt(n);
        if(nn==(int)nn){
            answer=(long)Math.pow(Math.sqrt(n)+1,2);
        }else{
            answer=-1;
        }
        return answer;
    }
}