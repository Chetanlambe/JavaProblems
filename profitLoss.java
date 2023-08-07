// calculate the profit and loss

package conditional;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price");
        int cp = sc.nextInt(); // cp -> cost price
        System.out.println("Enter the selling price");
        int sp = sc.nextInt(); // sp -> selling price
        if(cp<sp){
            System.out.print("Get profit : RS ");
            System.out.println(sp - cp);
        }else{
            System.out.print("Get loss : RS ");
            System.out.println(cp - sp);
        }
    }
}
