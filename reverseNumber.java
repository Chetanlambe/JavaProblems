//To find the reverse number
package loops;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r = 0; // r means -> reverse
        while(n>0){
            r = r * 10;
            r = r + (n%10);
            n = n/10;
        }
        System.out.println("The reverse number is : "+ r);
    }
}
