# Lab 3 
# Jacq Kirkman
# CSC 110

import math

def main():
    print("This program is to test functions")
    
    # put your function calls here
    print(areaTrapezoid(4, 5, 8))
    print(areaTrapezoid(2, 7, 9))
    print(format(coneVolume(4, 14.5), '.2f'))
    print(format(coneVolume(1.2, 3.5), '.2f'))


# This function calculates and returns the area of a trapezoid
# parameter: base1, the length of the top of the trapezoid
# parameter: base2, the length of the bottom
# parameter: height, the height of the trapezoid
# See this website for a picture  http://math.com/tables/geometry/areas.htm

def areaTrapezoid(base1, base2, height):

    area = height / 2.0 * (base1 + base2)

    return area

# This function calculates and returns the volume of a cone
# parameter: radius, the length from the center of the base area to one edge
# parameter: height, the length from the center of the base area to the point
# See this website for a picture http://www.math.com/tables/geometry/volumes.htm

def coneVolume(radius, height):
    volume = (1 / 3) * math.pi * radius ** 2 * height
    return volume
    

main()

# Test cases
# Cone 1 - 4 unit radius and 14.5 unit height = 242.95 units cubed
# Cone 2 - 1.2 unit radius and 3.5 unit height = 5.28 units cubed
