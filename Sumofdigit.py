def sum_of_of_digits(n):
    sum = 0
    for i in n:
        sum += int(i)
    return sum

n = input("Enter a number: ")
x = sum_of_of_digits(n)
print("Sum of digits of", n, "is:", x)