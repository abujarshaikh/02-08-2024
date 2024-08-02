// Write a java program to print the smallest number of an array.

import java.util.Scanner;

public class program6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of an array: ");
          int n = sc.nextInt();// 2781,5132,7144,3170
          int[] arr = new int[n];
          System.out.println("Enter the elements of an array: ");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          int min = arr[0];
          for (int i = 1; i < n; i++) {
               if (arr[i] < min) {
                    min = arr[i];
               }
          }
          System.out.println("Largest number in an array is: " + min);
          sc.close();
     }
}