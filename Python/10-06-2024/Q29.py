
D={ i: ord(i.upper()) if i.islower() else ord(i.lower()) for i in "ManiDeepA" }
for i in D:
    print(i+" : "+str(D[i]))