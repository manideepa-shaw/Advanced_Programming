import re
user_data=[
    ("Mani","@gmail.com",22),
    ("Mani","jiya@gmail.com",22),
    ("Keshav Shaw","kesh@gmail.com",16),
    ("Nanko Shaw","kesh@gmail.com",14),
    ("Peeyush Kumar Sharma","peeyush@gmail.com",23),
    ]
Directory={}
for i in user_data:
    try:
        if i[0] in Directory:
            raise NameError
        if i[2] <0:
            raise ValueError
        if i[2]<16:
            raise ValueError
        if not re.search("\w+@\w+\.\w+",i[1]):
            raise TypeError
        Directory[i[0]]=i[1]
    except NameError:
        print("Name already exists.")
    except ValueError:
        if i[2]<0:
            print("Invalid Age")
        else:
            print("Age less than 16")
    except TypeError:
        print("Invalid Email: ",i[1])
print(Directory)