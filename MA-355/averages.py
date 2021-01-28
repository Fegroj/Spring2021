#Write a script that prompts the user for two numbers, a and b.
#Then, prompt the user to enter a type of average out of the three options below.
#Make it so the user would just type in a 
#number 1, 2 or 3 for the average
#(i.e. 1 for arithmetic mean, 2 for geometric mean, or 3 for root-mean-square).
#This numerical selection is an example of how to give the user a simple 
#response that will get around potential spelling errors and head off user 
#frustration. This design decision makes the user interaction more robust. 
#No requirement to round or format numbers for this problem. 
#Output the correct average, based on what the user selected.
import math


a = float (input ("Enter a value for A:"))
b = float (input ("Enter a value for B:"))
print("Number a:", a)
print("Number b:", b)

arithmeticMean = ((a+b)/2)
geometricMean = math.sqrt(a*b)
rms = math.sqrt((a **2+ b **2)/2)
print()

#input 1,2 or 3 for a choice
#'choice' takes users input for mean decision


print ("1-Arithmetic mean\n2-Geometric mean\n3-Root-mean-square\n")
choice = int (input ("Enter a value between 1 and 3:"))

if choice == 1:
    print ("Arithmetic Mean:", arithmeticMean)
elif choice == 2:
    print ("Geometric Mean:", geometricMean)
elif choice == 3:
    print ("Root-Mean-Square", rms)
else:
    print("Not a valid Option\Please try again")

