// Write a java program to print the addtion of all the digits of all the elements of an array.

import java.util.Scanner;

public class program3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of an array: ");
          int n = sc.nextInt();
          int[] arr = new int[n];
          System.out.println("Enter the elements of an array: ");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          int sum = 0;
          for (int i = 0; i < n; i++) {
               int temp = arr[i];
               while (temp != 0) {
                    int rem = temp % 10;
                    sum = sum + rem;
                    temp = temp / 10;
               }
          }
          System.out.println("addtion of all the digits of all the elements of an array: " + sum);
          sc.close();
     }
}
