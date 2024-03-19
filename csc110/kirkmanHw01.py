'''
Jacq Kirkman
9/27/2023

StoryBot 3000 - a Python Mad Libs Game
Prompts user to input words and then generates a story with the prompts.

Original Story:
There once was a dog named Pickles.
She had big ears and long, long legs.
Pickles's ears were so big that...
she could hear very well.
Pickles's legs were so long that...
she could run very well.

'''

#Game introduction
print('Hello! My name is StoryBot 3000')
print('To generate your story, can you give me a...')

#inputs
animal = input('Animal? ')
name = input('Name? ')
adj_1 = input('Adjective? ')
adj_2 = input('Another adjective? ')
verb_1 = input('Action verb? ')
adv_1 = input('Adverb? ')
verb_2 = input('Another action verb? ')
adv_2 = input('Adverb? ')
proceed = input('Great! Are you ready to generate your story?')

#outputs
print('...\nGenerating...\n...')
print('There once was a ', animal, ' named ', name, '.', sep='')
print(name, ' had ', adj_1, ' ears and ', adj_2,', ',adj_2, ' legs.', sep='')
print(name, '\'s ears were so ', adj_1, ' that...\nshe could ', verb_1, ' ', adv_1, ' well.', sep='')
print(name, '\'s legs were so ', adj_2, ' that...\nshe could ', verb_2, ' ', adv_2, ' well.', sep='')

'''
Written Report
I came up with this story based on my dog Pickles.
I knew I wanted to use adjectives as my inputs,
so I wrote a story describing her features.

I tested my program by starting with only
running a few lines of code at first.
Once I felt confident with those first lines,
I wrote the rest of the code.
I ran into an error, where one of my variables
was not defined. This is because I copy and
pasted the input, but didn't rename the variable.
So it was an easy fix.
Everything else worked smoothly.

I have a solid understanding of input, print, and
variables syntax from this assignment. Next time
I think it would be fun to incorporate some kind
of time out between the print statements, so it
feels like the bot is actually taking time to
think of a story.

'''
