// check the number is divisible by 5 or not
package conditional;
import java.util.Scanner;
public class numDivBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5 == 0)
            System.out.println("the number is the divisible by 5");
        else
            System.out.println("Not divisible by the 5");
    }
}
