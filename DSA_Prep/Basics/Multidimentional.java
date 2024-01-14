public class Multidimentional {
    public static void main(String[] args) {
        // declare array with values
        int [][][] arr = {
            {
                {1,23,3,4},
                {4,5,3,5}
            },
            {
                {1,23,3,4},
                {4,5,3,5}
            },
            {
                {1,23,3,4},
                {4,5,3,5}
            }
        };

        // printing the value in the arr
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                for (int k=0; k<arr.length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
