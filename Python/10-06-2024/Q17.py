import heapq as hq

print("Enter elements with their priority : (element,priority)")
ele=pri=1
Q=[]
while True:
    i=input()
    if not i:   break
    ele,pri=i.split()
    pri=int(pri)
    hq.heappush(Q,(pri,ele))

print("The elements according to the priority are (low number greater priority) : ")
while Q:
    print(hq.heappop(Q))