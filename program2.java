// Write a java program to print the addtion of last digits of all the elements of an array.

import java.util.Scanner;

public class program2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter the size of an array: ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          System.out.println("enter the elements of an array");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          int sum = 0;
          for (int i = 0; i < n; i++) {
               sum = sum + arr[i] % 10;
          }
          System.out.println("sum of last digits of all the elements of an array is " + sum);
          sc.close();
     }
}