def solution(myString, pat):
    table = myString.maketrans({'A':'B', 'B':'A'})
    return 1 if pat in myString.translate(table) else 0