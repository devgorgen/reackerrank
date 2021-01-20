package SocksTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<Integer> soltas = new ArrayList<Integer>();

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pares = 0;

        for (Integer i : ar) {
            if (!soltas.contains(i)) {
                soltas.add(i);
            } else {
                pares++;
                soltas.remove(i);
            }

        }
        return pares;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] xxx = {1, 3, 1, 4, 4, 2, 1, 1};
        sockMerchant(4, xxx);
    }
}
