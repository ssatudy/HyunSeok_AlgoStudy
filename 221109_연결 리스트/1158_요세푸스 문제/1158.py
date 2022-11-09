from collections import deque

n, k = map(int, input().split())
q = deque()
for i in range(1, n + 1):
    q.append(i)
ans = []

while q:
    for i in range(k - 1):
        q.append(q.popleft())
    ans.append(str(q.popleft()))
print('<', (', ').join(ans), '>', sep='')
