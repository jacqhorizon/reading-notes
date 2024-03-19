'''
Lab 8
Jacq Kirkman
CSC 110
12/1/2023
'''

def main():
    invalid = True
    while invalid:
        integer = input('Enter a valid integer: ')
        try:
            int(integer)
            print(f'{integer} is a valid integer')
            invalid = False
        except Exception as err:
            print(f'{integer} is not a valid integer, try again.')

    
main()
