public class Array {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // dataType[] arrayName; e.g. int[] arr;

        // declare an array
        double[] arr;

        // allocate memory
        arr = new double[10];

        // Alternatively, we can declare and allocate memory in one step

        double[] arr2 = new double[10];


        // declare and initialize an array
        int[] age = {12, 4, 5, 2, 5};

        // declare and array 
        int[] arr3 = new int[10];

        // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        age[3] = 2;


        // using loop to access array elements
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // using for-each loop to access array elements
        for (int i : age) {
            System.out.println(i);
        }

        



    }
}
