public class Pattern12 {
    static void pattern12(int n){
        for (int i=1;i<n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=n-1;j>i; j--){
                System.out.print(" ");

            }
            for (int j=n-1;j>i; j--){
                System.out.print(" ");
            }
            for( int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern12(n);
    }
}
