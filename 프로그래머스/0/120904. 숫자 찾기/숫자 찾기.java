class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n = String.valueOf(num);
        String kk = String.valueOf(k);
        if(n.contains(kk)){
            answer=n.indexOf(kk)+1;
        }else{
            answer=-1;
        }
        return answer;
    }
}