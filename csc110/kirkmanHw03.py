'''
Jacq Kirkman
10/17/23

Savings Calculator
Given the monthly deposit and interest rate, calculate total balance and
interest over 20 years and 30 years.
It also calculates what the balance would be if the deposit was doubled and
how much would need to be deposited monthly in order to achieve the 20 year
balance in 10 years.
This program assumes the compounding periods is 12, but it can be adjusted
to account for different numbers of periods.
'''

PERIODS = 12

def main():
    # inputs
    deposit = float(input('How much will you deposit per month? '))
    interest = float(input('What is the annual interest rate? \nInput as a percentage. (Ex: 5) '))

    # calculations
    balance20 = total_annuity(20, deposit, interest, PERIODS)
    interest20 = total_interest(deposit, PERIODS * 20, balance20)
    balance30 = total_annuity(30, deposit, interest, PERIODS)
    interest30 = total_interest(deposit, PERIODS * 30, balance30)
    double_balance20 = total_annuity(20, deposit * 2, interest, PERIODS)
    double_interest20 = total_interest(deposit * 2, PERIODS * 20, double_balance20)
    deposit10 = ten_year_deposit(balance20, interest, PERIODS)
    
    # display
    print(f'Given {interest}% annual interest rate and depositing ${deposit: .2f} monthly:')
    print()
    print('Years\tFinal Balance\tInterest')
    display_values(20, balance20, interest20)
    display_values(30, balance30, interest30)
    print()
    print('With doubling the monthly deposit:')
    display_values(20, double_balance20, double_interest20)
    print()
    print(f'In order to save ${balance20} within 10 years,')
    print(f'you would need to deposit ${deposit10: .2f} monthly.')

# Calculates total annuity and returns final balance
# parameter: years - number of years
# parameter: deposit - monthly deposit
# parameter: interest - annual interest rate as a percentage
# parameter: periods - number of compounding periods
def total_annuity(years, deposit, interest, periods):
    decimal_interest = interest / 100
    periodic_interest = decimal_interest / periods
    annuity = (deposit * ((1 + periodic_interest) ** (years * periods) - 1)) / periodic_interest
    return round(annuity, 2)

# Calculates the total interest earned
# parameter: deposit - monthly deposit
# parameter: periods - total number of periods
# parameter: balance - final balance
def total_interest(deposit, periods, balance):
    total = balance - periods * deposit
    return round(total, 2)

# Display the years, final balance, and total interest earned
# parameter: years - number of years
# parameter: balance - final balance
# parameter: interest - total interest earned
def display_values(years, balance, interest):
    print(f'{years}\t${balance}\t${interest}')

# Calculates the monthly deposit needed to achieve a balance in 10 years
# parameter: balance - the desired balance
# parameter: interest - annual interest rate as a percentage
# paramter: periods - number of compounding periods
def ten_year_deposit(balance, interest, periods):
    decimal_interest = interest / 100
    periodic_interest = decimal_interest / periods
    deposit = (periodic_interest * balance) / ( (1 + periodic_interest) ** (10 * periods) - 1)
    return round(deposit, 2)

main()

'''
Test Cases

Test Case #1
Monthly deposit = $10
Annual interest rate = 6%

Final Balance (20 years) = $4620.41
Total Interest (20 years) = $2220.41
Final Balance (30 years) = $10045.15
Total Interest (30 years) = $6445.15

Test Case #2
Monthly deposit = $600
Annual interest rate = 0.04%

Final Balance (20 years) = $144575.12
Total Interest (20 years) = $575.12
Final Balance (30 years) = $217297.56
Total Interest (30 years) = $1297.56

I started by writing a flowchart to figure out what inputs, calcuations,
and outputs I needed. Then I wrote a function to calculate the annuity
and tested it. After that I wrote the total interest function and tested
that one. Once I knew both functions were working correctly I put it all
together with inputs and outputs.
I calculated my test cases by hand and then ran the program. I would like
to add some kind of error checking to the inputs, for example if a user inputs
a word instead of the interest the program should warn the user that a word
is not an acceptable input and prompt them to input the interest again.
I learned how to structure multiple functions and reuse them to calculate
and display multiple values. Next project I would think more about the structure
in my flowchart instead of just focusing on calculations.

'''

