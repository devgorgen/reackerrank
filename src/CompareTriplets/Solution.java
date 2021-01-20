package CompareTriplets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {


    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int listA = 0;
        int listB = 0;

        if (a.size() == b.size()) {
          for (int i = 0; i <= a.size(); i++) {
              if (i < a.size()) {
                  if (a.get(i) > b.get(i)) {
                      listA++;
                  } else if (a.get(i) < b.get(i)) {
                     listB++;
                  }
              }
          }
        }

        List<Integer> result = new ArrayList<>();
        result.add(listA);
        result.add(listB);
        result.stream().forEach(x -> System.out.println(x));


        return result;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> la = new ArrayList<Integer>() {{add(2); add(1); add(0);}};
        List<Integer> lb = new ArrayList<Integer>() {{add(5); add(1); add(0);}};
        compareTriplets(la, lb);
    }
}
