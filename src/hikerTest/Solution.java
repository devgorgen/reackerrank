package hikerTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {


    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int resposta = 0;

        int aux = 0;
        int stepsX = 0;

        char[] arr = path.toCharArray();
        for (char let : arr) {
            if (stepsX >= steps-1) {
                break;
            }
            if (let == 'U') {
                aux++;
            } else if (let == 'D') {
                aux--;
            }

            if (aux == 0) {
                resposta++;
            }
            stepsX++;

        }

        System.out.println(resposta);
        return resposta;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String xxx = "UDDDUDUU";
        countingValleys(8, xxx);
    }
}
