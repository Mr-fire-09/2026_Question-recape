def reveseNumber(n):
    reverse = 0
    while n > 0:
        digit = n % 10
        reverse = (reverse * 10) + digit
        n = n // 10
    return reverse

n = int(input("Enter a number: "))
x = reveseNumber(n)
print("Reverse of", n, "is:", x)