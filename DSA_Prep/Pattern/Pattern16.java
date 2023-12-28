public class Pattern16 {

    static void pattern15( int n){
        char ch='A';
        for ( int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern15(n);

    }
}
