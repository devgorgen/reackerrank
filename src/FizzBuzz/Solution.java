package FizzBuzz;

import java.io.IOException;
import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++ ) {
            if (isMultiple(i, 3) && isMultiple(i, 5)) {
                System.out.println("FizzBuzz");
            } else if (isMultiple(i, 3) && !isMultiple(i, 5)) {
                System.out.println("Fizz");
            } else if (!isMultiple(i, 3) && isMultiple(i, 5)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    static boolean isMultiple(int x, int y) {
        float rest = x % y;
        return rest == 0;
    }


    public static void main(String[] args) throws IOException {
        fizzBuzz(15);
    }
}
