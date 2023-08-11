// Print the table of any number

package loops;
import java.util.Scanner;
public class tableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for print the table");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
