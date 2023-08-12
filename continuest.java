// Display the even number upto 100 using the continue ststement
package loops;
public class continuest {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
