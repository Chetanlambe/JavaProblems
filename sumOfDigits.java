// calculate the sum of digit
package loops;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int lastDigit;
        int sum = 0;
        while(n!=0){
            lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/10;
        }
        System.out.println("Sum of the digit is : "+ sum);

    }
}
