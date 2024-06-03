# filter out odd squares using map, filter, list

listnum=range(1,51)

def square(x):  return x**2
def odd(x): return x%2

su = list(filter(odd,map(square ,listnum)))
print(su)