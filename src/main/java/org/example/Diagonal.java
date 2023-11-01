package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Diagonal {

  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(4, 5, 6);
    List<Integer> list3 = Arrays.asList(17, 8, 9);

    List<List<Integer>> list = new ArrayList<>();
    list.add(list1);
    list.add(list2);
    list.add(list3);
    System.out.println("list = " + list.size());
    int result = getDifferance(list);
    System.out.println("result = " + result);
  }

  public static int getDifferance(List<List<Integer>> arr) {
    int a1 = 0;
    int a2 = 0;

    for (int i = 0; i < arr.size(); i++) {
      a1 = a1 + arr.get(i).get(i);
    }
    for (int j = 0; j < arr.size(); j++) {
      a2 = a2 + arr.get(j).get(arr.size() -j- 1);
    }
    return Math.abs(a2 - a1);
  }
}
