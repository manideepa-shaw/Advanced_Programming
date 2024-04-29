import re

phone=input("Enter a phone number(xxx-xxx-xxxx) : ")
if re.search("\d{3}-\d{3}-\d{4}",phone):
    print("Valid Phone number")
else:
    print("Not a valid Phone number")