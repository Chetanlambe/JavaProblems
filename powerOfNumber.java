//Two numbers are entered through the keyboard. Write a program to
// find the value of one number raised to the power of another

package loops;
import java.util.Scanner;
public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int a = sc.nextInt();
        System.out.println("Enter power ");
        int b = sc.nextInt();
        int i;
        int power = 1;
        for(i=1;i<=b;i++){
            power = power * a;
        }
        System.out.println(a + " raised to the power "+ b +" is "+ power);
    }
}
