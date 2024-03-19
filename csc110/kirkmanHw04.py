'''
Jacq Kirkman
10/24/23

Halloween Gui
A program that displays a haunted house with pumpkins scene.
'''
from Gui import *

g = Gui()
g.title('Homework 4')
canvas = g.ca(1000, 600)

def main():
    # background
    canvas.rectangle([[-500, -70],[500, 600]],fill='#5e427d')
    canvas.rectangle([[-500, -600],[500, -70]],fill='#df6826')
    
    # scene elements
    mountain(-70, 0, 2.5, '#3A4BA6')
    mountain(-400, -70,3.5, '#283373')
    mountain(320, -70, 4, '#283373')
    house(0, -150)
    pumpkin(-300, -150, 0.5, 'orange', 'green')
    pumpkin(-400, -200, 1, 'orange', 'green')
    pumpkin(300, -150, 0.5, 'orange', 'green')
    pumpkin(150, -200, 0.75, 'orange', 'green')
    pumpkin(400, -220, 1.2, 'orange', 'green')

# Generates a pumpkin using the coordinates as the middle center
# parameter: x - x coordinate
# parameter: y - y coordinate
# parameter: scale - number to scale the pumpkin by
# parameter: color1 - pumpkin color
# parameter: color2 - stem color
def pumpkin(x, y, scale, color1, color2):
    canvas.oval([[x-50*scale,y-50*scale],[x+50*scale, y+30*scale]], fill=color1)
    canvas.rectangle([[x-5*scale, y+20*scale],[x+5*scale, y+50*scale]], fill=color2)
    # canvas.line([[x, y-50*scale],[x,y+50*scale]], fill='black')

# Generates a house piece using the coordinates as the bottom center
# parameter: x - x coordinate
# parameter: y - y coordinate
# parameter: width - number to scale the width by
# parameter: height - number to scale the height by
# parameter: color1 - house color
def house_piece(x, y, width, height, color1):
    canvas.rectangle([[x-30*width, y],[x+30*width, y+140*height]], fill=color1)
    canvas.polygon([[x-50*width, y+140*height],[x-20*width, y+160*height],[x, y+200*height],[x+20*width, y+160*height],[x+50*width, y+140*height]], fill=color1)
    # canvas.line([[x, y],[x,y+100*height]], fill='black')

# Generates a window using the coordinates as the middle center
# parameter: x - x coordinate
# parameter: y - y coordinate
# parameter: scale - number to scale the window by
# parameter: color1 - window color
def window(x, y, scale, color1):
    canvas.rectangle([[x-25*scale,y-50*scale],[x+25*scale,y+10*scale]], fill=color1)
    canvas.polygon([[x-25*scale, y+10*scale],[x, y+50*scale], [x+25*scale, y+10*scale]], fill=color1)
    # canvas.line([[x,y-50*scale],[x,y+50*scale]], fill='black')

# Generates a house using the coordinates as the bottom center
# parameter: x - x coordinate
# parameter: y - y coordinate
def house(x, y):
    house_piece(x, y, 5, 1, '#0E0A03')
    house_piece(x-120, y, 1, 2, '#0E0A03')
    house_piece(x-200, y, 2, 1.2, '#0E0A03')
    house_piece(x+120, y, 1, 2, '#0E0A03')
    house_piece(x+200, y, 2, 1.2, '#0E0A03')
    window(x-120,y+240, 0.5,'#F7D44A')
    window(x+120,y+240, 0.5,'#F7D44A')
    window(x-200, y+120, 0.7, '#F7D44A')
    window(x+200, y+120, 0.7, '#F7D44A')

# Generates a mountain using the coordinates as the bottom center
# parameter: x - x coordinate
# parameter: y - y coordinate
# parameter: scale - number to scale the mountain by
# parameter: color1 - mountain color
def mountain(x,y, scale, color1):
    canvas.polygon([[x-100*scale, y],[x-40*scale, y+70*scale],[x+20*scale, y]],fill=color1)
    canvas.polygon([[x-60*scale, y],[x+20*scale, y+50*scale],[x+100*scale, y]],fill=color1)
    # canvas.line([[x,y],[x,y+70*scale]],fill='black')
    
main()
g.mainloop()

'''
I started by sketching out my scene on paper and identifying what functions
I would need to make. From there, I wrote one function at a time starting by
calculating the coordinates on paper by hand and then writing the Gui code.

I tested my code after each function to make sure it was generating correctly
before calling it more and at different locations/sizes. My homework meets the
specification because there are 4 different functions that create scene
elements and each is called at least 3 times.

I learned how to plan and build a scene using Gui.py. It was interesting
to work with the coordinates and use numbers to create drawings. Next time
I would do a little more planning because there were a few times that I
had to rewrite the function entirely because I wanted to change where the
coordinate center alignment was.
'''
