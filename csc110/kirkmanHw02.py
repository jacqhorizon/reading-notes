#Jacq Kirkman
#Oct 7, 2023
#Ida the Interior Design Assistant
#A program to calculate interior dimensions and
#costs for flooring and paint, given user inputs

import math
WINDOW_PERCENT = 0.1

#input: get room dimensions from user
print('Hello, my name is Ida the Interior Design Assistant.')
# proceed = input('Ready to begin? Press enter to start.')
print()
print('First, I will need some info.')
print('Please input the following numbers. Do not include units.\nExample: 10.99 or 11')
print()
length = float(input('Length in feet: '))
width = float(input('Width in feet: '))
height = float(input('Height in feet: '))
paint_price = float(input('Price for a can of paint: '))
floor_price = float(input('Price for a square foot of flooring: '))
print('Thanks! Give me a moment to calculate...')
print()

#process: use given dimensions to calculate dimensions and costs
length = float(length)
width = float(width)
height = float(height)
paint_area = 2 * height * (width + length) + (length + width)
floor = length * width
volume = length * width * height
trim = 4 * (length + width)
cans_of_paint = math.ceil(((1 - WINDOW_PERCENT) * paint_area) / 350)
paint_cost = cans_of_paint * paint_price
floor_cost = math.ceil(floor) * floor_price

#output: print final calculations with units
print('I have calculated your results.\nYou entered:')
print(f'\t{length}ft long x {width}ft wide x {height}ft high')
print(f'\t${paint_price:.2f} per can of paint')
print(f'\t${floor_price:.2f} per square feet of flooring')
print('Here are your calculations:')
print(f'\tTotal wall area to paint: {paint_area} sq ft')
print(f'\tTotal volume: {volume} cu ft')
print(f'\tTotal trim: {trim} ft')
print(f'\tCans of paint needed: {cans_of_paint}')
print(f'\tTotal cost of paint: ${paint_cost:.2f}')
print(f'\tFlooring needed: {math.ceil(floor)} sq ft')
print(f'\tTotal cost of flooring: ${floor_cost:.2f}')

# I started by writing a flow chart to indicate the inputs I would need to collect
# Followed by writing out all the formulas I needed.
# At first I felt a little stumped with formatting, my output did not
# Look readable enough. I referred back to the examples and referenced those
# For formatting ideas. I then ran the following test cases.

# Test Case #1
# 10.0ft long x 12.0ft wide x 15.0ft high
# $2.99 per can of paint
# $1.99 per sqft of flooring

# Paint Area: 682 sqft
# Floor Area: 120 sqft
# Volume: 1800 cu ft
# Trim: 88 ft
# Cans of paint: 2
# Total paint cost: $5.98
# Total cost of flooring: $238.80


# Test Case #2
# 32ft long x 52ft wide x 9ft high
# $12 per can of paint
# $20 per sqft of flooring

# Paint Area: 1596
# Floor Area: 1664 sqft
# Volume: 14976 cu ft
# Trim: 336 ft
# Cans of paint: 5
# Total paint cost: $60.00
# Total cost of flooring: $33280.00

# I feel like this assignment was really good practice with the coding process.
# There's was a lot of formulas to calculate, and it was very helpful to
# Figure them out ahead of time before starting to code.
