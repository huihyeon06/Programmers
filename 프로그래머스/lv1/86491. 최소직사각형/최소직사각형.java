class Solution {
    public int solution(int[][] sizes) {
        int answer = 0, temp=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[0][0]<sizes[i][0]){
                sizes[0][0]=sizes[i][0];
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[0][1]<sizes[i][1]){
                sizes[0][1]=sizes[i][1];
            }
        }
        answer=sizes[0][0]*sizes[0][1];
        return answer;
    }
}