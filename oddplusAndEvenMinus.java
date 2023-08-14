// Calculate the series 1-2+3-4+5-......n

package loops;
import java.util.Scanner;
public class oddplusAndEvenMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0)
                sum = sum + i;  // odd number is add
            else
                sum = sum - i;  // even number is subtract
            }
        System.out.println("sum is : "+ sum);
        }
    }


