# lists are heterogenous
# Strings are immutable
# lists are mutable objects
# all the methids mutates the original list or existing list

names = ["apple","google","yahoo","instagram"]
print(names)

items = ["apple",True,0,7.3453]
print(items)

print(len(names))

# methods of list
# print(dir(names))

# 'append', 'clear', 'copy', 'count', 'extend', 'index', 'insert', 'pop', 'remove', 'reverse', 'sort'
names.append("facebook") # modifying the same list

print(names)

print(names.index("yahoo")) # 2
# print(names.index("Yahoo")) # ValueError

print(names.insert(2,"signal"))  # we can insert any item in any index
print(names.insert(100,"infosys"))  # if I try to insert in an item which is out of range then it will append in the last.

print(names.count("yahoo"))
print(names.count("tesla")) # 0 (because it is not present in the list)

### extend method
a=[1,2,3]
b=[3,4,5,6]
print(id(a))
a.extend(b)
print(a)
print(id(a))

###  pop method

# returns and removes the last item of the list
print(names.pop()) 
print(names)

# returns and removes the mentoned index of list
print(names.pop(0)) 
print(names)

### remove

print(names.remove("google")) 
print(names)

# print(names.remove("google"))  # ValueError - Exception occurs when item not present in the list 

### revrse method
names.reverse()
print(names)

### sort
names.sort()
print(names)


# To sort a list in descending order
# - sort and reverse it

names.sort()
names.reverse()
print(names)

### clear method
names.clear()
print(names)
print(len(names))