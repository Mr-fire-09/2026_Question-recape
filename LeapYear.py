def leap_Year(year):
    """Return True if year is a leap year, else False, and print the result."""
    # Leap year if divisible by 400, or divisible by 4 but not by 100
    if (year % 400 == 0) or ((year % 4 == 0) and (year % 100 != 0)):
        print(year, "is a leap year")
        return True
    else:
        print(year, "is not a leap year")
        return False
        

year = int(input("Enter a year: "))
leap_Year(year)