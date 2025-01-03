def solution(d, budget):
    d.sort()
    i=0
    while(i<len(d) and budget>=d[i]):
        budget-=d[i]
        i+=1
    return i