package conditional;
import java.util.Scanner;
public class divisibleFiveOrThreeNTfifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15 != 0){
                System.out.println("Number is divisible by the 3 or 5");
            }else{
                System.out.println("Not matching require condition");
            }
        } else{
            System.out.println("Not matching require condition");
        }
    }
}
