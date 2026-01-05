
import java.util.*;

public class Postive_Negative {

    public static void Postive_Negative(int num) {
        if (num > 0) {
            System.out.println(num + " is a Positive Number");
        } else if (num < 0) {
            System.out.println(num + " is a Negative Number");

        } else {
            System.out.println(num + " is neither Positive nor Negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Postive_Negative(num);
    }
}
