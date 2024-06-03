# print first 10 odd and evem numbers using iterators and compress
import itertools

odd_num = [ n%2==1 for n in range(1,21) ]
even_num = [ n%2==0 for n in range(1,21) ]
print(odd_num)
print(even_num)

odd = list(itertools.compress(range(1,21),odd_num))
print("Odd : ",odd)
even = list(itertools.compress(range(1,21),even_num))
print("Even : ",even)
