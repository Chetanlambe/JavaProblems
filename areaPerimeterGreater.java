// calculate the area and the perimeter of the rectangle
package conditional;
import java.util.Scanner;
public class areaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if(area > perimeter){
            System.out.println("Area is greater than the perimeter");
        }else if(perimeter > area){
            System.out.println("Perimeter is greater than the area");
        }else{
         System.out.println("area and perimeter are equal");
        }
    }
}
