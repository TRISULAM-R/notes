# TupLes are represented in a round brackets
# Tuples are similar to list except tuples are immutable but list are mutable objects
# Tuples are heterogenous
# we can have duplicate items

numbers = (1,2,4,5)
print(numbers)

print(len(numbers))

# Indexing
print(numbers[0]) # 1
print(numbers[1]) # 2
print(numbers[-1]) # 5


# Assignment of a tuple is not possible because it is immutable
# numbers[0] = -1 # will throw TypeError: 'tuple' object does not support item assignment

# we can loop over tuples
for i in numbers :
    print("i => ",i)

# tuples are heterogenous
num = ("hello",2,5.6)

print(num)

# we can slice the tuple, it will return a new object (Note: original will not change)
print(numbers[:3])

for i in numbers[::-1] :
    print("i => ", i)

# Using in operator to check the number/item present in the object
print(4 in numbers)
print(4 in numbers[:2]) # False becaue this resultant tuple contains only (1,2)

# methods of tuple
# 'count', 'index'
print(dir(num))

# we can have duplicate items
names = ("apple","google","infosys","google","signal","google")
print(names.count("google"))

print(names.index("google",0,2))

items = [1,2.4,10,"hello","world",[1,2,4],(1,2,3)]
print(items)
temparatures = [("banglore", 26),("chennai", 32),("mumbai",20)]

# in case of tuples we cannot add 1 element so we need to add leading , (comma) to metion it as tuple
####### important #########
i = (1)
print(type(i)," : ") # <class 'int'> 

x = (1,)
print(type(x)," => ", len(x))  # <class 'tuple'>  =>  1


# in case of list we can store 1 item also
i = [1]
print(type(i)," : ",len(i)) # 