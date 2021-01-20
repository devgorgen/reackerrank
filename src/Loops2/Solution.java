package Loops2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    static List<Integer> calc(int a, int b, int n) {
        List<Integer> retorno = new ArrayList<>();
        int lastShot = (int) (a + Math.pow(2, 0) * b);
        for (int i = 1; i < n; i++) {
            int z = (int) (Math.pow(2, i) * b);
            lastShot += z;
            retorno.add(lastShot);
        }
        String w = String.valueOf(a + b);
        System.out.printf(w + " ");
        retorno.stream().forEach(v -> {
            System.out.printf(v.toString()+" ");
        });
        System.out.println("");
        return retorno;
    }

    public static void main(String[] args) throws IOException {
        int q = 2; //number of queries
        int a = 5;
        int b = 3;
        int n = 5; //repeticoes
        calc(a, b, n);
    }
}
