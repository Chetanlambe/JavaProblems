// calculate Simple interest
import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        double time;
        System.out.println("Enter the value of principal");
        principal = sc.nextDouble();
        System.out.println("Enter the value of the rate");
        rate = sc.nextDouble();
        System.out.println("Enter the value of the time ");
        time = sc.nextDouble();
        double si = (principal * rate * time)/100;
        System.out.println("Simple Interest is "+ si);
    }
}
