// calculate the factorial upto n number
package loops;
import java.util.Scanner;
public class factorialUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;   // fact -> factorial
        for(int i =1;i<=n;i++){
            fact = fact *i;
            System.out.println("Factorial of "+i + " is : "+fact);
        }
    }
}
