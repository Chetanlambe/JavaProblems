// Display the odd number upto 100 using the continue statement

package loops;
public class continuest1 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
