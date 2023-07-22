class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num=0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int l=j+1; l<nums.length; l++){
                    num=nums[i]+nums[j]+nums[l];
                    if(isPrime(num)){
                        answer++;
                    }       
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        boolean P=true;
        for(int k=2; k<num; k++){
            if(num%k==0){
                P=false;
            }
        }
        return P;
    }
}