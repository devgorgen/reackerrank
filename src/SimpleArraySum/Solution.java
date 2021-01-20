package SimpleArraySum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static ArrayList<Integer> soltas = new ArrayList<Integer>();


    private static final Scanner scanner = new Scanner(System.in);

    static int simpleArraySum(int[] ar) {
        int result = 0;

        for (int i = 0; i <= ar.length; i++) {
            if (i < ar.length) {
                result += ar[i];
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) throws IOException {
        int[] xxx = {1, 2, 3, 4, 10, 11};
        simpleArraySum(xxx);
    }
}
