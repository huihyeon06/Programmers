class Solution {
    public String solution(String s) {
        String[] ss = s.split(" ");
        int[] si =  new int[ss.length];
        for(int i=0; i<si.length; i++){
            si[i]=Integer.parseInt(ss[i]);
        }
        int max=si[0], min = si[0];
        for(int i=0; i<si.length; i++){
            if(si[i]>max){
                max=si[i];
            }else if(si[i]<min){
                min=si[i];
            }
        }
        
        return min+" "+max;
    }
}