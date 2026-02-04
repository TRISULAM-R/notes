import math

# Day 2
toll="sadf"
toll_2='apple'
print(type(toll),type(toll_2))
print('a' in "apple")
x='34'
y="534"
print(x in y)

######## str (String)
course = "python programming"
print(course.upper()) # Will create a new object so that old object (course) 
                      # is not affected
print(course.lower())
print(course.title())
print(course.strip()) # removes white space before & after the string
print(course.lstrip())
print(course.rstrip()) # to remove the space in right side
print(course.find("pro"))
print(course.replace("p","j"))
print("pro" in course)
print("swift" not in course)


######## numbers
print(10 + 3)
print(10 - 3)
print(10 * 3)
print(10 / 3)
print(10 // 3) # float division
print(10 % 3)
print(10 ** 3) # power

######### Working with numbers
print(round(2.5)) # will round off to the nearest value
print(abs(-2.7)) # absolute function provides the positive(+) value of it

# import statement is mandatory on the top
print(math.ceil(2.2)) #returns the near highest value
print(round(2.2)) # returns which ever is nearest.

#Type Conversion
print(int(x))
print(float(x))
print(bool(x))
print(str(x))

#Falsy
print(bool("")) # "" - False
print(bool(0)) # 0 - False
print(bool(1)) # 0 - True
print(bool(-1)) # 0 - True
print(bool("False")) # "False" - True
print(bool(None)) # None - False
print(bool()) # False

# Conditional satements
temparature = 15
if temparature > 22 :
    print("Its warm")
elif temparature > 15 :
    print("Its nice")
else :
    print("Its cold")
print("Done")

#ternery operator 
age = 20
message = "Eligible" if age >= 18 else "Not Eligible"
print(message)

#Logiccal Operators (Short-circuit behavior)
high_income = True
good_credit = True
student = False

if (high_income and good_credit) and not student:  # Short-circuit behavior: - Evaluation of interpretor stops when the value is false
    print("eligible for loan")
elif high_income or good_credit:
    print("eligible for loan with High Intrest rate")

# Chaining Comparison operator
age = 22

if 18 <= age < 65 : # if age >= 18 and age < 65 :
    print("Eligible")

# Task -1 guess the output
if 10 == "10":
    print("a")
elif "bag" > "apple" and "bag" > "cat":
    print("b")
else:
    print("c")

# Loops
for number in range(3):
    print("Attempt", number+1, (number+1)*".")

for number in range(1,4):
    print("Attempt", number, number*".")

for number in range(1,10, 2):
    print("Attempt", number)

# For Else
successful = False
for num in range(3) :
    print("Attempt")
    if successful :
        print("Successful")
        break
else :
    print("Attempted 3 times and failed")

# Nested loops
for x in range(2):
    for y in range(3):
        print(f"({x},{y})")

# Iterable - return type of range is an range object which is 'complex types' 
    # str is also a complex type or Iterable
for x in "Python":
    print(x)

    # List 
for i in [1,4,2,5] :
    print(i)

# While Loop
number = 100
while number > 0 :
    print(number)
    number //= 2

# Task -1 - To display even numbers between 1 -10
count = 0
for x in range(2,10,2):
    count+=1
    print(x)
else :
    print(f"We have {count} even numbers")

print()
count = 0
for x in range(1,10):
    if x % 2 == 0:
        count+=1
        print(x)
else :
    print(f"We have {count} even numbers")


#Methods
def practice(): # zero parameter method
    print("Hi there !!!")
    print("Welcome")


practice() # method without Argument

def practice(first_name, last_name):
    print(f"Hi {first_name} {last_name}")



practice("Trisulam", "R")

def get_greeting(name):
    return f"Hi {name}"


tri =get_greeting("Tri")

# keyword Argument (for better readability)
practice("Hello", last_name="five")

# Default Argument
def prcti(name, last="world"):
    print(f"{name} {last}")


prcti("Hello")
prcti("Hello", "wat")

# Variable argument function
def practicals(*numbers):
    num = 1
    for x in numbers:
        num *= x
    return num


print(practicals(1,2,3,4))