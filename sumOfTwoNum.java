// sum of the two number
import java.util.Scanner;
public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,sum;
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("Enter the second number");
        y = sc.nextInt();
        sum = x + y;
        System.out.println("Sum is "+ sum);
    }
}
