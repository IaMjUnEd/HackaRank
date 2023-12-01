package org.example.minmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value ");
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      int a = sc.nextInt();
      arr.add(a);
    }
    for (int i = 0; i < arr.size(); i++) {
      sum = sum + arr.get(i);
    }
    getMin(arr, sum);
  }

  static void getMin(List<Integer> arr, int sum) {
    int min = 0;
    int max = 0;
    int a = 0;
    for (int i = 0; i < arr.size(); i++) {
      min = sum - arr.get(i);
      if (min > sum) {
        min = sum;
      }
    }
    System.out.print(min);
    System.out.print(" ");
    int[] ma = new int[5];
    for (int i = 0; i < arr.size(); i++) {
      max = sum - arr.get(i);
      ma[i] = max;
    }

    int maxx = Arrays.stream(ma).max().getAsInt();
    System.out.print(maxx);
  }
}
