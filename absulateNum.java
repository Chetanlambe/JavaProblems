// print the absolute value of the number

package conditional;
import java.util.Scanner;
public class absulateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n<0){
            n = n * -1;
            System.out.println("Absolute value is : "+n);
        }else {
            System.out.println("Absolute value is : " + n);
        }
    }
}
