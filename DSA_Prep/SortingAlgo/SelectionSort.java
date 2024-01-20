package DSA_Prep.SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 4,7,3,4,6,8,9,2,1,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9 };

        // Selection Sort Algorithm : O(n^2)

        for (int i=0 ; i<arr.length-1; i++){  // n-1 passes
            int min = i;
            for (int j=i+1; j<arr.length; j++){ // n-i-1 comparisons
               if (arr[j] < arr[min]) {
                min = j;
               }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Print the array

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
