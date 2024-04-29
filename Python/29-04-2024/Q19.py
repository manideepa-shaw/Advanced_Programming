D={
    "a":5,
    "b":7,
    "z":1000,
    "c":500,
    "eight":800,
    "yo":2500,
    "d":2500,
    "oo":1000
}
print("Minimum price : ",min(D.values()))
print("Maximum price : ",max(D.values()))

print("Sorted Dictionary : ",sorted(D.items(), key=lambda x:x[1]))
D2={
    "a":6,
    "t":89,
    "r":70,
    "b":7,
    "eight2":800
}

print("Items that are only in first dict : ")
for i in D:
    if i not in D2:
        print(i," : ",D[i])
print("Items whose prices donot match : ")
for i in D:
    if i in D2:
        if D[i]!=D2[i]:
            print(i)
            
print("after removing duplicate items from 1st dictonary")
for i in D2:
    if i in D:
        D.pop(i)
print(D)

print("After sorting both dictionaries according to price : ")
print(sorted(D.items(), key=lambda x:x[1]))
print(sorted(D2.items(), key=lambda x:x[1]))

group={}
print("\n\nAfter grouping the stock according to price taht is multiple of 500")
for i in D:
    if D[i]%500==0:
        if D[i] not in group:
            group[D[i]]=[i]
        else:
            group[D[i]].append(i)
print(group)
print("\nStocks of prices = 800 \n")
for i in D:
    if D[i]==800:
        print(i)
for i in D2:
    if D2[i]==800:
        print(i)