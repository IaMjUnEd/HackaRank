package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddArray {

  public static Integer sumOfArray(List<Integer> ar) {
    int sum = 0     ;

    for (int i = 0; i < ar.size(); i++) {
      sum = sum + ar.get(i);
    }
    return sum;
  }

  public static void main(String[] args) {

    List<Integer> ar = new ArrayList<>();
    ar.add(10);
    ar.add(2);
    ar.add(3);
    ar.add(40);
    int res = sumOfArray(ar);
    System.out.println("res = " + res);
  }
}
