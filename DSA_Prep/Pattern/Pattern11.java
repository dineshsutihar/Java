public class Pattern11 {

    static void pattern11(int N){
        int start=1;

        for ( int i=0; i<N; i++){
            if (i%2==0) start =1;
            else start =0;
            for (int j=0; j<=i; j++){
                System.out.print(start+" ");
                start = 1-start;
            
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N=5;
        pattern11(N);
    }
}
