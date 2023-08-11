// print the AP => 4,7,10,13,... upto n th term
// an = a+(n-1)*d
package loops;
import java.util.Scanner;
public class printAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i=4;i<=3*n+3;i=i+3){
            System.out.println(i);
        }

    }
}
