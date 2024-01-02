class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length; i++){
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    answer=1;
                    if(j==spell.length-1){
                        return answer;
                    }
                }else{
                    answer=2;
                    break;
                }
            }
        }
        return answer;
    }
}