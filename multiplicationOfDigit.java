// calculate the multiplication of the digit
package loops;
import java.util.Scanner;
public class multiplicationOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int lastDigit;
        int ml = 1;
        while(n != 0){
            lastDigit = n % 10;
            ml = ml * lastDigit;
            n = n/10;
        }
        System.out.println("Multiplication of the digit is : "+ ml);
    }
}
