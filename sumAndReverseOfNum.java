//To find the reverse and sum of the given number
package loops;
import java.util.Scanner;
public class sumAndReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r = 0; // r means -> reverse
        int sum = 0;
        while(n>0){
            r = r * 10;
            r = r + (n%10);
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("The reverse number is : "+ r);
        System.out.println("Sum is digit is : "+ sum);
    }
}
