package RepeatedString;

import java.io.IOException;
import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long result = 0l;

        int sizeWord = s.length();
        char[] arr = s.toCharArray();
        int numOfAs = getNumOfAs(arr);


        System.out.println(numOfAs);
        long x = Math.floorDiv(n , sizeWord);

        System.out.println(x);

        if (x * arr.length < n) {
            long sum = x * arr.length;
            int rest = Math.toIntExact((n - sum));
            System.out.println("rest " +rest);
            String restWord = s.substring(0, rest);
            System.out.println(restWord);
            long restNumOfAs = getNumOfAs(restWord.toCharArray());
            result = (numOfAs * x) + restNumOfAs;

        } else {
            result = Math.multiplyExact(numOfAs , x);
        }


        System.out.println("result = "+result);
        return result;
    }

    private static int getNumOfAs(char[] arr) {
        int numOfAs = 0;
        for (char a : arr) {
            if (a == 'a') {
                numOfAs++;
            }
        }
        return numOfAs;
    }

    public static void main(String[] args) throws IOException {
        repeatedString("aba", 10l);
    }
}
