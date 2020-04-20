package Problem1;

import java.util.Scanner;

public class Occurences {
    public static void main(String args[]) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter all the Elements in the array :");
        for (i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Element whose occurence you want to know :");
        int n = sc.nextInt();
        int count = 0;
        for (i = 0; i < size; i++) {
            if (A[i] == n) {
                count++;
            }
        }
        System.out.println("No. of occurences of " + n + " is : " + count);

    }
}




