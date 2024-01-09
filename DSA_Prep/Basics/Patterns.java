public class Patterns {
    // Pattern 1
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=m; j++){
                if (i==1 || i==n || j==1 || j==m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; i<=n-i; j++){
                System.out.print(" "+j);
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 4;
        int m=5;
        pattern1(n);
        pattern2(n,m);
        pattern3(n);
    }
}
