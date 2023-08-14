// calculate the factorial of the number given by the user
package loops;
// factorial of n!= 1* 2* 3*...(n-1) * n
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        long factorial = 1;
        for (int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println("factotrrial of the "+n+" is "+factorial);
    }

}
