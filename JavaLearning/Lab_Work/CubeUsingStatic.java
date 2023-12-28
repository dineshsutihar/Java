package JavaLearning.Lab_Work;

import java.util.Scanner;

public class CubeUsingStatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = input.nextInt();
        int cube = getCube(number);
        System.out.println("The cube of " + number + " is " + cube);
    }

    private static int getCube(int num) {
        return num * num * num;
    }

}
