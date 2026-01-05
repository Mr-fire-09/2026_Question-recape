def sum_of_n_natural(n):
    sum = 0
    for i in range(n + 1):
        sum += i
    return sum

n = int(input("Enter a number: "))
x = sum_of_n_natural(n)
print("Sum of first", n, "natural numbers is:", x)
    