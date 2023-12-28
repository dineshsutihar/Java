public class Pattern9 {

    static void pattern9(int N){
        for(int i=N; i>=0; i--){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }

            for (int j=0; j<2*(N-i)-1; j++){
                System.out.print("*");
            } 

            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for (int j=0; j<2*(N-i)-1; j++){
                System.out.print("*");
            } 

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N=5;
        pattern9(N);
    }
}