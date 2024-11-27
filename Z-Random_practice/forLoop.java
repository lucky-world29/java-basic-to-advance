
public class forLoop {
    public static void main(String[] args) {
        mm();
        int jj=1;
        while ( jj<5) {
            System.out.println(
                jj
            );
            continue;  //infinite time print 
            ///jj ++;
        }
    }
    public static void mm(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
