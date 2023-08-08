package conditional;
import java.util.Scanner;
public class divisibleFiveNotthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n%5==0 && n%3!=0){
            System.out.println("Number is divisible by five & not divisible by 3");
        }else{
            System.out.println("not divisible");
        }
    }
}
