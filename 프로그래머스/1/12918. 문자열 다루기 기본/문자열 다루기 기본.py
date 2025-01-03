def solution(s):
    answer = True
    try:
        int(s)  
        if(len(s) not in (4,6)):
            answer=False
    except ValueError:  
        answer = False
    return answer