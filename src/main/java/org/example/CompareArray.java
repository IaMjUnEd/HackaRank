package org.example;

import java.util.Arrays;
import java.util.List;

public class CompareArray {

  public static List<Integer> compareToArray(List<Integer> a, List<Integer> b) {
    int al = 0, bo = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) == b.get(i)) {
        // nothing
      } else {
        if (a.get(i) > b.get(i)) {
          al++;
        } else {
          bo++;
        }
      }
    }
    return Arrays.asList(al, bo);
  }

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(5, 6, 17);
    List<Integer> b = Arrays.asList(3, 6, 10);

    System.out.println("Result: " + compareToArray(a, b));
  }
}
