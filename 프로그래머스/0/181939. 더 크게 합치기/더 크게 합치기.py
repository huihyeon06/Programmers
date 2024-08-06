def solution(a, b):
    r1= int(str(a)+str(b))
    r2= int(str(b)+str(a))
    return r1 if r1>r2 else r2