public class CopyingArray {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        int[] arr3 = arr1; // this is not copying the array, it is just referencing the array

        // copying array using for loop
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

        // printing the values
        for(int value: arr2){
            System.out.println(value);
        }
    }
}
