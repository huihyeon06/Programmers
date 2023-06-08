import java.util.Arrays;
class Solution {
    public String solution(int[] food) {
        String answer = new String();
        for(int i=1; i<food.length; i++){
            if(food[i]%2!=0){
                int size=food[i]-1;
                for(int j=0; j<size/2; j++){
                    answer+=i;
                }
            }else{
                for(int j=0; j<food[i]/2; j++){
                    answer+=i;
                }
            }
        }
        answer+="0";
        for(int i=food.length-1; i>0; i--){
            if(food[i]%2!=0){
                int size=food[i]-1;
                for(int j=0; j<size/2; j++){
                    answer+=i;
                }
            }else{
                for(int j=0; j<food[i]/2; j++){
                    answer+=i;
                }
            }
        }
        
        
        return answer;
    }
}