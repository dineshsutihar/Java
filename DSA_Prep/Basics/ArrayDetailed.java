public class ArrayDetailed {
    // Array is a collection of similar data types

    // for example, if we want to store 100 people's name then we can use array of strings to store them

    // syntax:
    // datatype[] arrayName = new datatype[size];




    public static void main(String[] args) {
        String name[] =new String[100]; // array of strings

        // we can also initialize the array with values
        int arr[] = {1,2,3,4,5}; // array of integers

        // we can also initialize the array with values using for loop
        int arr2[] = new int[5];
        for(int i=0;i<5;i++){
            arr2[i] = i+1;
        }

    //    printing the values 
        for( int value: arr2){
            System.out.println(value);
        }
    }
}
