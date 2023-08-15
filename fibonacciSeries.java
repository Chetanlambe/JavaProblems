//Calculate the n thfibonacci series number
package loops;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        int sum = 1;
        for (int i =1;i<=n-2;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(" the "+n+"th fibonacci is "+sum);
    }
}
