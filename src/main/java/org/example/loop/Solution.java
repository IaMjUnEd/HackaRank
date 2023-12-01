package org.example.loop;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a");
    int a = Integer.parseInt(sc.nextLine());
    System.out.println("Enter value of b");
    int b = Integer.parseInt(sc.nextLine());
    System.out.println("Enter value of n");
    int n = Integer.parseInt(sc.nextLine());

    generateSeries(a, b, n);
    //    a=0
    //      b=2
    //      n=10

  }

  public static void generateSeries(int a, int b, int n) {
    int sn = a + (1 * b);
    System.out.print(sn + " ");
    for (int i = 2; i < n; i++) {
      sn = (int) (sn + (Math.pow(2, i) * b));
      System.out.print(sn + " ");
    }
  }
}
