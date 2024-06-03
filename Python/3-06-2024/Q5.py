def fib(n):
    a,b=0,1
    yield(a)
    yield(b)
    for i in range(n-2):
        s=a+b
        yield(s)
        a,b=b,s

print(list(fib(7)))