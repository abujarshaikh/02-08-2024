// Write a java program to print the addtion of fisrt digits of all the elements of an array.

import java.util.Scanner;

public class program4 {
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
               int firstDigit = arr[i] / 10;
               sum = sum + firstDigit;
          }
          System.out.println("Sum of first digits of all elements of an array is: "+sum);
          sc.close();

     }
}