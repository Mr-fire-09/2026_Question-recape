import java.util.Scanner;

public class Sum_of_N_Natural {

    public static int Sum_of_N_Natural(int n ){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = Sum_of_N_Natural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
        sc.close();
    }
}