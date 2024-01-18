public class LabeledBreak {
    public static void main(String[] args) {
        
        
        // the for loop is labeled as outer
        outer:
        for(int i=0;i<5;i++){

            // the for loop is labeled as inner
            inner:
            for(int j=0;j<5;j++){
                if(i==3){
                    break outer; // breaks the outer loop
                } else if(j==3){
                    break inner; // breaks the inner loop
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
