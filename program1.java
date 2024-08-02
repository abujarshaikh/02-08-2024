// Write a java program to copy elements of one array into another array.

import java.util.Scanner;

/**
 * program1
 */
public class program1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter size of an array: ");
          int n = sc.nextInt();
          int arr1[] = new int[n];
          int arr2[] = new int[n];
          System.out.println("Enter elements of first array:");
          for (int i = 0; i < n; i++) {
               arr1[i] = sc.nextInt();
          }
          System.out.println("Elemets of Array After Copying");
          for (int i = 0; i < arr2.length; i++) {
               arr2[i] = arr1[i];
          }
          for (int i = 0; i < arr2.length; i++) {
               System.out.print(arr2[i] + ", ");
          }

          sc.close();
     }
}