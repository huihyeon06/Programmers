#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = true;
    int xc = x;
    int sum=0;
    while(x>0){
        sum+=x%10;
        x/=10;
    }
    if(xc%sum!=0){
        answer=false;
    }
    return answer;
}