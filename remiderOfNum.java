import java.util.Scanner;
public class remiderOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

        if(a>b){
            int m = a % b;
            System.out.println("remainder is "+ m);
        }
        else{
            System.out.println(" a is not greater than b");
        }
    }
}
