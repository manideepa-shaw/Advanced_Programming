import string
class palindrome:
    pali_words=set()
    def __init__(self,text):
        self.text=text.split()
    def palindrome(self):
        for i in self.text:
            flag=0
            for j in range(len(i)//2):
                if i[j]!=i[len(i)-j-1]: 
                    flag=1
                    break
            if flag==0:
                if i not in self.pali_words:    self.pali_words.add(i)

text="Hi world kanak is a palindrome and also paap and also madam"
obj = palindrome(text)
obj.palindrome()
print("Palindrome wordsb are : "+str(obj.pali_words))
print("\nUnique Words are : "+str(set(text.split())))