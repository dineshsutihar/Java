package DSA_Prep.SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 4,7,3,4,6,8,9,2,1,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9 };

        // Insertion Sort Algorithm : O(n^2)

        for (int i=1 ; i<arr.length; i++){  // n-1 passes
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        // Print the array

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
