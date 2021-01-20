package FindSubstring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.

    public static String findSubstring(String s, int k) {
        String maiorString = "Not found!";
        int maiorTamanho = 0;
        int pontoDeQuebra = 0;

        int soma = 0;
        String test = "";
        String substring = "";

        for (int i = 0; i <= s.length(); i++) {
            char[] splitted = s.toCharArray();
            if (i+k <= s.length()) {
                substring = s.substring(i, i+k);
            }
                if (test == "" || pontoDeQuebra == k & soma > maiorTamanho) {
                    test = substring;
                }
                char letter = splitted[i];
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'  ) {
                    soma++;
                }
                if (soma > maiorTamanho && pontoDeQuebra == k) {
                    maiorTamanho = soma;
                    maiorString = test;
                }
                if (pontoDeQuebra < k) {
                    pontoDeQuebra++;
                } else {
                    i += k;
                }
            }

        System.out.println(maiorString);
        return maiorString;
    }


    public static void main(String[] args) throws IOException {
        findSubstring("eiuaooo", 4);
    }
}
