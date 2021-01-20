package JumpingOnTheClouds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;

        int aux = 0;
        boolean cleanCloud = false;

        for (int cloud : c) {
            if (aux == 5 && cleanCloud) {
                jumps++;
                aux++;
                cleanCloud = false;
            } else if (cleanCloud && cloud == 0) {
                jumps++;
                aux += 2;
                cleanCloud = false;
            } else if (cleanCloud && cloud == 1) {
                jumps++;
                aux += 1;
                cleanCloud = false;
            } else if (cloud == 1) {
                jumps++;
                aux += 2;
                cleanCloud = false;
            } else {
                cleanCloud = true;
            }
        }

            System.out.println(jumps);
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] xxx = {0, 0, 0, 0, 1, 0};
        jumpingOnClouds(xxx);
    }
}
