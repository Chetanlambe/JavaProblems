
// Display the AP => 1,3,5,7,9,... upto n
// 1,3,5,7,9,11,13 differance is 2 between two number then i=i+2
// an = 1 +(n-1)*2   =   1+2n-2  =  2n-1
package loops;
import java.util.Scanner;
public class oddNumPrintAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i=i+2){
            System.out.println(i);
        }
    }
}
