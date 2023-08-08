// Take three number input and tell if they can be sides of the triangle

package conditional;
import java.util.Scanner;
public class sideOfTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int a = sc.nextInt();
        System.out.println("Enter the second side");
        int b = sc.nextInt();
        System.out.println("Enter the third side");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid triangle ");
        }else{
            System.out.println("Invalid Triangle ");
        }
    }
}
