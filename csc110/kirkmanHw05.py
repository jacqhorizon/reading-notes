'''
Jacq Kirkman
11/1/23

Rock, Paper, Scissors Competition
A game that prompts the user to play rock, paper, scissors.
'''
import random

def main():
    # intro
    print('Welcome to the Rock, Paper, Scissors Competition!')
    print('Can you beat the computer?')
    print('')

    # game
    user = user_choice()
    if user == '0' or user == '1' or user == '2':
        user = int(user)
        comp = comp_choice()
        result_value = game(comp, user)
        print('')
        print(f'{choice_values(user)} vs {choice_values(comp)}')
        print(f'  User       Comp  ')
        game_result(result_value)
    else:
        print('INVALID SELECTION')

# Randomly selects an integer that corresponds with the game options
def comp_choice():
    return random.randint(0, 2)

# Prompts the user to select an integer that corresponds with the game options
def user_choice():
    print('Enter 0, 1, or 2 to make your selection:')
    print('\t0 - Rock')
    print('\t1 - Paper')
    print('\t2 - Scissors')
    return input('Selection:')

# Translates the game option index into it's corresponding word
# param: index - the index of the game option
def choice_values(index):
    if index == 0:
        return '  Rock  '
    elif index == 1:
        return ' Paper  '
    elif index == 2:
        return 'Scissors'

# Checks whether the user or computer wins
# param: comp - computer's selection as an integer
# param: user - users's selection as an integer
def game(comp, user):
    if user == comp:
        return 'Tie'
    elif user == 0:
        if comp == 1:
            return 'Lose'
        else:
            return 'Win'
    elif user == 1:
        if comp == 2:
            return 'Lose'
        else:
            return 'Win'
    elif user == 2:
        if comp == 0:
            return 'Lose'
        else:
            return 'Win'

# Prints an ASCII result screen
# param: result_value - the result of the game as a string
def game_result(result_value):
    if result_value == 'Win':
        print('__   __            _    _ _       ')
        print('\ \ / /           | |  | (_)      ')
        print(' \ V /___  _   _  | |  | |_ _ __  ')
        print('  \ // _ \| | | | | |/\| | | \'_ \ ')
        print('  | | (_) | |_| | \  /\  / | | | |')
        print('  \_/\___/ \__,_|  \/  \/|_|_| |_|')
    if result_value == 'Lose':
        print('__   __            _                    ')
        print('\ \ / /           | |                   ')
        print(' \ V /___  _   _  | |     ___  ___  ___ ')
        print('  \ // _ \| | | | | |    / _ \/ __|/ _ \ ')
        print('  | | (_) | |_| | | |___| (_) \__ \  __/')
        print('  \_/\___/ \__,_| \_____/\___/|___/\___|')
    if result_value == 'Tie':
        print(' _____ _      _ ')
        print('|_   _(_)    | |')
        print('  | |  _  ___| |')
        print('  | | | |/ _ \ |')
        print('  | | | |  __/_|')
        print('  \_/ |_|\___(_)')
                
                
main()

'''
I approached this assignment similar to how I approached last weeks assignment.
I started by making note of all the functions I would need and what they would do.
From there I coded an outline of the functions, before going thru and coding and
testing each one. I got stuck for a moment with the user input because I forgot
that inputs are strings, not integers.

For fun, I found a ASCII text generator and used those for the result screen.

I tested the program by inputting all the possible selections as well as selections
that should result in errors. I would like to add a feature where the game will
start over if the user inputs an invalid selection.

I learned how to plan a complicated if/else statement and execute it.
Next time, I hope to have learned about how to make the complicated if/else
statements read smoother!
'''
