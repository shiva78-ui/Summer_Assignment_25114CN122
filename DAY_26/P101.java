import java.util.*;
import java.util.Random.*;

public class P101 {
    public static void main(String[] args) {
        // Random class is used to give the random numbers
        Random rn = new Random();
        int random = rn.nextInt(100) + 1;// range of int start from 0 so after we add 1 it is added to every number and
                                         // range changes to 1 -100
        Scanner sc = new Scanner(System.in);
        int count = 0;
        // this loop only ends when the condition is true
        while (true) {
            System.out.println("Guess the number between(1-100): ");
            int n = sc.nextInt();
            // after each attempt count increases by 1
            count++;
            if (n == random) {
                System.out.println("Congrants! You won");
                System.out.println("Attempt made: " + count);
                break;
            } else if (random > n) {
                System.out.println("Please try again , Number is higher");
            } else {
                System.out.println("Please try again , Number is smaller");
            }

        }
        sc.close();
    }
}