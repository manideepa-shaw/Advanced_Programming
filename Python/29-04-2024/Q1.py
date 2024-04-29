def prime(x):
    if x<=1:    return False
    for i in range(2,(x//2)+1):
        if x%i==0:
            return False
    return True

print("Enter range(low high): ", end='')
low,high = list(map(int,input().split()))
for i in range(low,high+1):
    if prime(i):
        print(i)