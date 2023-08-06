// Calculate the valume of the Sphere
// valume of the Sphere is V = 4.0/3.0 * 3.14159 * r * r * r;

import java.util.Scanner;
public class valumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r; // r -> radius
        System.out.println("Enter the value of radius");
        r = sc.nextFloat();
        double pi = 3.14159; // value of pi
        double V = (4.0/3.0) * pi * ( r * r * r); // V = Valume of Sphere
        System.out.println("Valume of Sphere is "+V);
    }
}
