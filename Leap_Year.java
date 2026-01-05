import java.util.*;

public class Leap_Year {

    public static boolean Leap_Year(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is not a leap year");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        Leap_Year(year);
        sc.close();
    }
}