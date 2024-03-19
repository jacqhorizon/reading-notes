'''
Jacq Kirkman
12/11/23

Key Set Comparison
This program prompts the user to input a file name and will compare it against a key set.
'''

def main():
    #Input
    fileSource = getFileSource()

    # Get matches

    lines = fileSource.readlines()
    keyList = getKeySource()
    readFileSource(lines, keyList)
    allMatches = readFileSource(lines, keyList)

    #Calculate the average and number of datasets
    sum = 0
    for i in range(len(allMatches)):
        sum += allMatches[i][2]
        print(allMatches[i])
    num_of_datasets = len(lines)//2
    average = sum / num_of_datasets

    #Ouput
    print(f'# of Datasets = {num_of_datasets}, Average matches = {average}')
    fileSource.close()

# reads the key source file and returns it's values in a list
def getKeySource():
    keySource = open('Key.txt', 'r')
    line = keySource.readline()
    keyList = []
    while line != '':
        for char in line:
            if char != '\n':
                keyList.append(char)
        line = keySource.readline()
    return keyList

# Prompts user to input file name and tries to read it, returns the file source
def getFileSource():
    noFileSet = True
    while noFileSet:
        fileInput = input('Enter the name of your data set file:')
        try:
            fileSource = open(fileInput, 'r')
            noFileSet = False
            return fileSource
        except Exception as err:
            print(err)

# reads the lines in the file source and compares them to the key list, returns list of results
# param: lines - the lines in the file source
# param: keyList - list of keys to compare to
def readFileSource(lines, keyList):
    allMatches = []
    for i in range(0, len(lines), 2):
        results = []
        results.append(lines[i][:-1])
        keyMatches = compareDataSet(lines[i+1].split(','), keyList)
        results.append(keyMatches[0])
        results.append(keyMatches[1])
        allMatches.append(results)
    return allMatches

# compares each dataset to the key list
# param: dataSet - the dataset as a list
# param: keyList - the list of keys to compare to
def compareDataSet(dataSet, keyList):
    count = 0
    matches = []
    for i in range(len(keyList)):
        if dataSet[i] == keyList[i]:
            count += 1
            matches.append(True)
        else:
            matches.append(False)
    return [matches, count]

main()