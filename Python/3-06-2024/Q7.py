import os
def findFile(dir,temp,ans):
    if os.path.isfile(dir):
        ans.append(temp)
        return
    for i in os.listdir(dir):
        findFile(dir+'/'+i,temp+"/"+i,ans)

fname = "../../Python"
ans=[]
# print(fname.filename)
findFile(fname,"",ans)
for i in ans:   print(i)
# print(ans)