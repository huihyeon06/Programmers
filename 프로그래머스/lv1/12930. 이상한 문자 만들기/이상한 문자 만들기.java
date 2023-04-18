class Solution {
    public String solution(String s) {
        String answer="";
        int index=0;
        for(int i=0; i<s.length(); i++){
            char s_arr = s.charAt(i);
            if(s_arr==' '){
                index=0;
                answer+=" ";
                continue;
            }
            if(index%2==0){
                answer+=String.valueOf(Character.toUpperCase(s_arr));
            }else{
                answer+=String.valueOf(Character.toLowerCase(s_arr));
            }
            index++;
            
        }
        // for(int i=0; i<s_arr.length; i++){
        //     for(int j=0; j<s_arr[i].length(); j++){
        //         if(j%2==0){
        //             answer+=Character.toUpperCase(s_arr[i].charAt(j));
        //         }else{
        //             answer+=s_arr[i].charAt(j);
        //         }
        //     }
        // }
        return answer;
    }
}