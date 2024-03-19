
// WAP a java program to calculate the sum and average of a array.

public class AC2 {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 5, 3, 7, 3, 8, 24, 56, 34, 6 };
        int sum = 0;
        double average = 0;
        // for each loop here
        for (int number : arr) {
            sum += number;
        }
        // calculating the average
        int arrlength = arr.length;

        // calculating the average.
        average = (double) sum / (double) arrlength;

        // printing the values
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
