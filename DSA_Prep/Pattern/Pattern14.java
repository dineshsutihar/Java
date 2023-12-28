public class Pattern14 {

    static void pattern14(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }
        
    

    public static void main(String[] args) {
        int n=5;
        pattern14(n);
    }
}