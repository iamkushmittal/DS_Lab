package Problem2;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        int[] A = new int[size];

        System.out.println("Enter " + size + " elements in the Array :");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Duplicate Elements :");
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j])
                    System.out.println(A[j]);
            }
        }

    }

}