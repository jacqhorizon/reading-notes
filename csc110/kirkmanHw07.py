'''
Jacq Kirkman
11/28/23

File Statistics Calculator
A program that reads a file and creates a file with it's statistics
'''

def main():
    intro()

    runProgram = True

    while runProgram:
        fileSource = getFileSource()
        getFileStats(fileSource)
        runProgram = endPrompt()

# Prints an introduction to the program
def intro():
    print('Welcome to the File Statistics Calculator')
    print('\n')
    print('This program will read your file, calculate it\'s statistics, and create a file with the statistics.')
    print('To begin...')
    print('\n')

# Prompts user to input file name and tries to read it, returns the file source
def getFileSource():
    noFileSet = True
    while noFileSet:
        fileInput = input('Enter the name of your file:')
        try:
            fileSource = open(fileInput, 'r')
            noFileSet = False
            return fileSource
        except Exception as err:
            print(err)

# Creates a file and writes the statistics
# param: fileSource - the original source file
# Writes the following statistics
# param: ch - number of characters
# param: le - number of letters
# param: co - number of consonants
# param: di - number of digits
# param: sp - number of spaces
# param: wo - number of "word" characters
# param: pu - number of punctuation
def writeStatsFile(fileSource, ch, le, co, di, sp, wo, pu):
    fileName = fileSource.name[:-4] + 'Stats.txt'
    file = open(fileName, 'w')
    file.write(f'Statistics for source file: {fileSource.name}\n')
    file.write(f'\tCharacters: {ch}\n')
    file.write(f'\tLetters: {le}\n')
    file.write(f'\tConsonants: {co}\n')
    file.write(f'\tDigits: {di}\n')
    file.write(f'\tSpaces: {sp}\n')
    file.write(f'\tWord Characters: {wo}\n')
    file.write(f'\tPunctuation: {pu}\n')
    file.close()

# Reads file, calculates statistics, and writes them to a file
# param: fileSource - the source of the original file
def getFileStats(fileSource):
    # statistics
    chars = 0
    letters = 0
    consonants = 0
    digits = 0
    spaces = 0
    words = 0
    punc = 0

    line = fileSource.readline()

    while line != '':
        spaces += 1  # Each time a new line is read, add to new line/space counter
        for char in line:
            chars += 1
            if 'a' <= char <= 'z':
                letters += 1
                if char not in 'aeiou':
                    consonants += 1
            elif '0' <= char <= '9':
                digits += 1
            elif char == ' ' or char == '\t':
                spaces += 1
            elif char in '#$%&*+-/<=>@':
                words += 1
            elif char in '!"\'(),.:;?[\]^_`{|}~':
                punc += 1
        line = fileSource.readline()
    writeStatsFile(fileSource, chars, letters, consonants,
                   digits, spaces, words, punc)
    fileSource.close()

# Prompt user to end the program or continue
def endPrompt():
    exitInput = input('Do you want to continue? Y for Yes and N for No')
    if exitInput.upper() == 'N':
        print('Goodbye')
        return False
    else:
        return True

main()

'''
I started this assignment by figuring out how to calculate the statistics. I reviewed the ASCII character table and 
used the values to get the largest character groups. From there it became easier to create conditions for the
remaining groups. After that, I created a flow chart of how the program would run. I struggled with making the 
program repeatedly ask for the file name, but reviewing the notes helping me figure it out.
I tested the program by printing the characters as I iterated through them to confirm they were being counted
correctly. This assignment taught me how to create a complete program with better error handling than previous
assignments.
'''
