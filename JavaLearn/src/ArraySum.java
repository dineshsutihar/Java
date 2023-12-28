package JavaLearning;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        // initize the input for taking the input.
        try (Scanner input = new Scanner(System.in)) {
            // Size of Array will be enterd here.
            System.out.print("Enter the Size of Array:");
            int arraySize = input.nextInt();
            int arr[] = new int[arraySize];

            // Array elements will be Entered here.
            System.out.println("Enter the elements of array:");
            for (int i = 0; i < arraySize; i++) {
                int arrayElement = input.nextInt();
                arr[i] = arrayElement;// assignining the elements to array from user.
            }

            // Sum of array will be printed here.
            int sum = 0;
            System.out.println("Sum Of The Array is ");
            for (int i : arr) {
                sum += i;
            }
            System.out.println(sum);

            // Printing the averge of all the array elements.

            System.out.println("Average is :" + (float) sum / (float) arraySize);
        }
    }
}