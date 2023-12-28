public class LoopsInJava {
    public static void main(String[] args) {
        // types of loops
        // for loop
        // while loop
        // do-while loop
        // for-each loop


        // for loop
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while loop
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        // do-while loop

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j < 10);

        // for-each loop
        int[] arr = {1, 2, 3, 4, 5};
        for(int k : arr) {
            System.out.println(k);
        }

        // break and continue
        // break is used to stop the execution of the loop
        // continue is used to skip the current iteration of the loop

        // break
        for(int l = 0; l < 10; l++) {
            if(l == 5) {
                break;
            }
            System.out.println(l);
        }

        // continue
        for(int m = 0; m < 10; m++) {
            if(m == 5) {
                continue;
            }
            System.out.println(m);
        }

    }
}
