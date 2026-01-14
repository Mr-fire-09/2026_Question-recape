import java.util.Scanner;

public class SumOfDigit {

    // Method to calculate sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10);   // get last digit
            n = n / 10;            // remove last digit
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfDigits(num);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}
