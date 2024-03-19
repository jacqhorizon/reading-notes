# Author: Jacq Kirkman
# Week 2 Lab
# Conversion

# Input
time = input('Enter amount of time in hours')

# Calculations
minutes = round((float(time) % 1) * 60)
hours = int(float(time) // 1)

# Output
print('%s hours is equivalent to %d hours and %d minutes!'%(time, hours, minutes))

# Test cases
# User input 4.1 prints '4.1 hours is equivalent to 4 hours and 6 minutes!'
# User input 10.25 prints '10.25 hours is equivalent to 10 hours and 15 minutes!'
