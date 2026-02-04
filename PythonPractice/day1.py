#1
print("Hello, Python!")

#2 - Declare Variables
name = "Trisulam"
age = 24
price = 20.98
price_2 = 20
is_active = True

#3 - printing
print("My name is", name)
print(f"My age is {age}")

#4 - Taking input
# name = input("Enter your name ")
# print("Your name is",name)

#5 - simple calculations
a=4
b=11
print("Sum :",a+b)
print("Sub :",a-b + (a-b))
print("Multiply :",a*b)
print("Division :",b/a)
print("Floor division :",b//a)
print("Power :",a**b)

# Task 1 - create a function to take input from the user "name" && "age" and print
# name_2 = input("Enter Your name ")
# age_2 = input("Enter Your age ")
# print(f"Your name is {name_2} and you are {age_2} years old.")

#Task 2 - convert 'C to 'F
temp = 35
formula = (temp*9/5)+32
print(f"Temprature {temp} :",formula) 

#Task 3-  Print their types 
tollerance = "Zero"
integer = 1
flt = 3.5
print(type(tollerance),type(integer),type(flt))

#1 Chellenge Add two numbers using user input.
# one= int(input("Enter 1"))
# two= int(input("Enter 2"))
# print(one+two)

#2 Challenge Multiply three numbers and print result.
num_1=13
num_2=13
num_3=13
add=num_1+num_2+num_3
print(f"Addition {add}")

#3 Challenge Swap two variables (without using third variable).
x=23
y=12
x=x+y
y=x-y
x=x-y
print(f"{x} : {y}")

# optimized way:
e=12
f=43
e,f = f, e
print(e,f)


# DAY 1 Score: 10/10 — Excellent Start!

# input()
# type conversion
# f-strings
# swapping
# printing
# basic syntax