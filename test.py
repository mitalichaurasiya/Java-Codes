'''s="abaoba"
l=list(reversed(s))
x=''.join(l) 
if x==s:
    print("yes")
else:
    print("No")'''



'''s="Mitali"
print(s.index("i"))
print(s[2])
l=[1,2,3,4]
print(l[0])'''


'''print("Enter your name ")
s=input()
print("Hello ",s,", have a good day")'''


'''
print("Enter your km value:")
km=float(input())
mile=km/1.609
print(round(mile,4))'''


'''print("enter the number: ")
a=int(input())
#if isinstance(a,int):
if type(a) is int:
    print("Value is int")
else:
    print("Value is not int")'''

#print(7/4*9/2)

''''print("Enter the comaparision number")
a=int(input())
print("Enter the compared number")
b=int(input())
if b>a:
    print("compaired number is vadda")
else:
    print("compaired number is chinna")'''

'''print("Enter the value of v:")
v=int(input())
print("Enter the value of u:")
u=int(input())
z=(v**2-u**2)/2
print("The value of Given Expression is :",z)'''


'''s=input()
print(s.lower())'''


'''s=input()
print(s.replace(' ', '_'))'''


'''s=input("Enter your name: ")
print("\"Dear",s, ", Hope you are doing good, Thank you!\"")'''


'''s="This is  a String   a"
print(s.index("  "))
print(s.index("   "))'''

'''a=11
t=int(input())
if t==a:
    print("I am 11 ")
else:
    print("I am not 11")'''

'''
a=float(input("enter first sub marks: "))
b=float(input("enter second sub marks: "))
c=float(input("enter third sub marks: "))

p= (a+b+c)/3
if p>40:
    if a>33 and b>33 and c>33:
        print("Pass")
    else:
        print("Fail")
else:
    print("Fail")'''


s=int(input("Please Enter your Number: "))
if s==1:
    print("MON")
elif s==2:
    print("tue")
elif s==3:
    print("Wed")
elif s==4:
    print("Thur")
elif s==5:
    print("Fri")
elif s==6:
    print("Sat")
elif s==7:
    print("Sun")
else:
    print("Invalid Number")








