def solution(x, n):
    answer = []
    increase = x
    for cnt in range(n):
        answer.append(x)
        x+=increase
    return answer