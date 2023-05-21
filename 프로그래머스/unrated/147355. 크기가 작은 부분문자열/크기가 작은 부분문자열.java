class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String a;
        for(int i=0; i<=t.length()-p.length(); i++){
            a = t.substring(i, i+p.length());
            long num1 = Long.parseLong(a);
            long num2 = Long.parseLong(p);
            if(num1<=num2){
                answer++;
            }
        }
        return answer;
    }
}