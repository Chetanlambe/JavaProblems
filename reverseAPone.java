// Display this GP 100, 50, 25, .... upto n th term

package loops;
import java.util.Scanner;
public class reverseAPone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        float a = 100;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a = a * 1/2;
        }
    }
}
