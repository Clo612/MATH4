import sys
import os

def main():
    print("Welcome to the Math Program!")
    
    while True:
        try:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            operation = input("Choose an operation (+, -, *, /): ")
            
            if operation == '+':
                result = num1 + num2
            elif operation == '-':
                result = num1 - num2
            elif operation == '*':
                result = num1 * num2
            elif operation == '/':
                result = num1 / num2
            else:
                print("Invalid operation. Please try again.")
                continue
                
            print("Result: {} {} {} = {}".format(num1, operation, num2, result))
            
            choice = input("Do you want to continue (y/n)? ")
            if choice.lower() != 'y':
                break
                
        except ValueError:
            print("Invalid input. Please enter a valid number.")
        except ZeroDivisionError:
            print("Cannot divide by zero. Please enter a non-zero number.")

    print("Program ended. Thank you for using the Math Program!")

if __name__ == "__main__":
    main()
