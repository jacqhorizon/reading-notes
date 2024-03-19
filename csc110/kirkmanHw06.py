'''
Jacq Kirkman
11/11/23

Line Grids and Fans GUI
A program that renders line grids and fans in the GUI 
'''
CANVAS_WIDTH = 900
CANVAS_HEIGHT = 800


from Gui import *

def main():
    # Figure 1
    line_grid(120, -200, 300, 20, 'brown')
    # Figure 2
    line_grid(200, 135, 200, 5, 'purple')
    # Figure 3
    line_grid(90, -300, -280, 8, 'red')
    # Figure A
    fan(120, 0, 0, 10, 'blue', True)
    # Figure B
    fan(200, -350, 0, 9, 'orange', False)
    # Figure C
    fan(150, 200, -200, 5, 'green', False)
    # Red fan row
    fan_row(140, -350, 310, 15, 5, 'red')
    # Purple fan row
    fan_row(100, -400, -165, 4, 8, 'purple')
    
# Renders line grid in GUI
# param: width - the width of the grid
# param: x - the top left x point
# param: y - the top left y point
# param: num - the number of lines to render
# param: color - the color of the lines
def line_grid(width, x, y, num, color):
    spacing = width / (num - 1)
    for n in range(0, num):
        canvas.line([[x, y - n * spacing],[x + width, y - n * spacing]], fill = color)

# Renders a fan in GUI
# param: width - the width of the fan
# param: x - the common x point
# param: y - the common y point
# param: num - the number of lines to render
# param: color - the color of the lines
def fan(width, x, y, num, color, up):
    spacing = width / (num - 1)
    if up:
        direction = y + width
    else:
        direction = y - width
    for n in range(0, num):
        canvas.line([[x, y],[x - width / 2 + n * spacing, direction]], fill = color)

# Renders line grid in GUI
# param: width - the width of the fan
# param: x - the common x point
# param: y - the common y point
# param: num_l - the number of lines to render
# param: num_f - the number of fans to render
# param: color - the color of the lines
def fan_row(width, x, y, num_l, num_f, color):
    for z in range(0, num_f):
        if z % 2 == 0:
            fan(width, x+z*width, y, num_l, color, True)
        else:
            fan(width, x+z*width, y+width, num_l, color, False)

g = Gui()
g.title('HW6 Lines')

# canvas is the drawing area
canvas = g.ca(width = CANVAS_WIDTH, height = CANVAS_HEIGHT)
main()
g.mainloop()
