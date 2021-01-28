#Write a script that prompts the user for a number of gallons of gasoline. Reprint that value, along with its conversion to other measurements:
   #• Equivalent number of liters (format to 4 decimals)
    #• Number of barrels of oil required to produce it (format to 3 decimals)
    #• Price in U.S. dollars (format to 2 decimals)
#Figures to use:
    #• 1 gallon is equivalent to 3.7854 liters.
    #• 1 barrel of oil produces 19.5 gallons of gas.
    #• The average price of gas is approximately $3.65 per gallon.
#Save your script as: gas.py



val = float (input ("Enter your value in gallons for conversion: ")) #requests input while outputting string
print ("Gallons entered:", float(val)) #prints out what was entered as a string


liters = val * 3.7854
barrel = val / 19.5
gasPrice = val * 3.65

print ("Gallons to liters:", round((liters),4))
print ("Gallons to barrels:",round((barrel),3)) 
print ("Gas Price: $", round((gasPrice),2))



