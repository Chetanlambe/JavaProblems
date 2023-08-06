// find the area of circle
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        double r; // r = radius
        double a; // area of circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius number");
        r = sc.nextFloat();
        a = 2 * 3.14 * r * r;
        System.out.println("Area of circle "+ a);

    }
}
