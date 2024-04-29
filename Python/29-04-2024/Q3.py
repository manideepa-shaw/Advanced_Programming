def o(x):
    return x%2
# odd=list(map(o,[1,2,3,4,5,6,7,8,9,10]))
print("odd no")
for i in range(1,11):
    if o(i):    print(i)

print("even no")
for i in range(1,11):
    if not o(i):    print(i)