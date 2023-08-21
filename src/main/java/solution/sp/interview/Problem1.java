package solution.sp.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number for addition: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number for addition: ");
        int num2 = scanner.nextInt();

        int[] numbers = new int[]{num1,num2};

        /* for loop */
        int sumForLoop = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumForLoop += numbers[i];
        }
        System.out.println("Sum (for loop): " + sumForLoop);

        /* while loop */
        int sumWhileLoop = 0;
        int i = 0;
        while (i<numbers.length){
            sumWhileLoop += numbers[i];
            i++;
        }
        System.out.println("Sum (while loop): " + sumWhileLoop);

        /* recursion */
        int sumRecursion = 0;
        int j = 0;
        add(numbers, sumRecursion, j);
    }

    private static void add(int[] numbers, int sumRecursion, int j) {
        if (j >= numbers.length) {
            System.out.println("Sum (recursion): " + sumRecursion);
            return;
        }
        sumRecursion += numbers[j];
        add(numbers, sumRecursion, ++j);
    }
}
