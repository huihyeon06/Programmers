import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> cnt = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            cnt.add(nums[i]);
        }
        if(cnt.size()>nums.length/2){
            int i=cnt.size();
            while(i!=nums.length/2){
                i=i-1;
            }
            answer=i;
        }else{
            answer=cnt.size();
        }
        return answer;
    }
}