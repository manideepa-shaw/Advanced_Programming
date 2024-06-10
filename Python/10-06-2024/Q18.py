L=[]
import heapq as hq
print("Enter -999 to stop")
while True:
    i=int(input())
    if i==-999: break
    hq.heappush(L,i)
k=int(input("Enter k : "))
print("Smallest k items are : ")
for i in range(k):
    print(hq.heappop(L))