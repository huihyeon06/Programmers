import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int answer[]={};
        int num1[]={1,2,3,4,5};
        int num2[]={2,1,2,3,2,4,2,5};
        int num3[]={3,3,1,1,2,2,4,4,5,5};
        int cnt1=0,cnt2=0,cnt3=0;
        for(int i=0; i<answers.length; i++){
            if(num1[i%num1.length]==answers[i]){
                cnt1++;
            }
            if(num2[i%num2.length]==answers[i]){
                cnt2++;
            }
            if(num3[i%num3.length]==answers[i]){
                cnt3++;
            }
        }
        int max=Math.max(Math.max(cnt1,cnt2),cnt3);
        ArrayList<Integer> l=new ArrayList<Integer>();
        if(max==cnt1){
            l.add(1);
        }
        if(max==cnt2){
            l.add(2);
        }
        if(max==cnt3){
            l.add(3);
        }
        answer = new int[l.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=l.get(i);
        }
        return answer;
    }
}