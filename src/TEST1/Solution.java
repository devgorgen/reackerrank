package TEST1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static ArrayList<Palavra> wordSetComplex = new ArrayList<>();

    // Complete the sockMerchant function below.
    public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
        
        for (String word: wordSet) {
            Palavra palavra = new Palavra(word, word.length());
            wordSetComplex.add(palavra);
        }
        List<Long> retorno = new ArrayList<>();
        for (String sentence : sentences) {
            long soma = 1;

            String[] palavras = sentence.split(" ");
            for (String palavra : palavras){


                        int x = matches(palavra).size();
                        soma *= x;

            }
            retorno.add(soma);
        }

        return retorno;
    }

    static ArrayList<String> matches(String word) {
        ArrayList<String> anagramas = new ArrayList<>();
        ArrayList<String> candidatas = new ArrayList<>();

            for (Palavra x : wordSetComplex) {
                if (x.tamanho == word.length()) {
                    candidatas.add(x.nome);
                }
            };
            char[] a = word.toCharArray();
            Arrays.sort(a);
            for (String candidata: candidatas) {
                char[] b = candidata.toCharArray();
                Arrays.sort(b);
                if (Arrays.equals(a, b)) {
                    anagramas.add(candidata);
                }
            }

        return anagramas;
    }

    static class Palavra {
        String nome;
        int tamanho;

        public Palavra(String nome, int tamanho) {
            this.nome = nome;
            this.tamanho = tamanho;
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<String> wordSet = new ArrayList<String>() {{add("the"); add("bats"); add("tabs"); add("in"); add("cat"); add("act");}};
//        List<String> wordSet = new ArrayList<String>() {{add("star"); add("stay"); add("seed"); add("eesd"); add("date"); add("tars"); add("tay");add("dees");add("rast");add("ate");}};
        List<String> sentences = new ArrayList<String>() {{add("cat the bats"); add("in the act"); add("act tabs in");}};
//        List<String> sentences = new ArrayList<String>() {{add("ate date stay"); add("rast tay star"); add("tay stay tars"); add("seed dees star");add("ate seed rast");}};
        countSentences(wordSet, sentences);
    }
}
