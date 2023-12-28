package JavaLearning.Lab_Work;

import java.util.Arrays;

public class Array {

    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    public void sort() {
        Arrays.sort(elements);
    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] elements = { 64, 34, 25, 12, 22, 11, 90 };
        Array arr = new Array(elements);
        System.out.println("Original array:");
        arr.print();
        arr.sort();
        System.out.println("Sorted array:");
        arr.print();
    }
}
