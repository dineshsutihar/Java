public class Pattern15 {

    static void pattern15(int n){
        for (int i=n; i>=1; i--){
            for(char ch='A'; ch<='A'+i-1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        pattern15(n);
    }
}