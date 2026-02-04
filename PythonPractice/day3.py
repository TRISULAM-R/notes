
# Day - 3 - String

# Methods of String
word = "Hello World"

print(dir(word)) # will return the actions/methods that can be performed on that object
print(id(word)) # will return the memory location of a variable
u_word = word.upper()
l_word = word.lower()
swap_case = word.swapcase()

print(u_word)
print(l_word)
print(swap_case)

sentence = "hello world hello there hi hi"
print(sentence.startswith("hello")) # checks str starts with hello -> True
print(sentence.startswith("h")) # checks str starts with h -> True
print(sentence.endswith("hi")) # checks str ends with hi -> True
print(sentence.split()) # splits with whitespace and convert into list

record = "2020-01-02, IN, India, SEARO,0,0,0"
print(record.split(",")) # splits with comma and convert into list

greeting = "hello world hello there hi hi"
print(id(sentence))
print(id(greeting))
print(greeting.find("o"))
