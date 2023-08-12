// Check the given number is the prime number or composite

package loops;
import java.util.Scanner;
public class findPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        for(int i =2;i<=n-1;i++){
            if(n%i == 0){
                a = 1;
                break;
            }
        }
        if( n == 1){
            System.out.println("1 is neither positive nor prime");
        }else{
            if(a == 0){
                System.out.println("The given number is prime");
            }else{
                System.out.println("The given number is the composite");
            }
        }

    }
}
