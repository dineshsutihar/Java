public class SumAndAverageArray {
    public static void main(String[] args) {
        int[] number = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int num : number) {
            sum += num;
        }

        // get the total number of elements
        int arrayLength = number.length;

        // calculate the average
        // convert the average from int to double
        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
