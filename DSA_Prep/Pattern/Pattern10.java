public class Pattern10 {

    static void pattern10(int N){
        for(int i=1; i<N; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N=5;
        pattern10(N);
    }
}
