package loops;
//print the evan number 1 to 100
import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args) {
//        for (int i=1;i<=100;i++){
//            if(i%2 == 0)
//                System.out.println(i);
//        }
//            upto n number print the even number
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i=1;i<=n;i++) {
                if (i % 2 == 0)
                    System.out.println(i);
            }
    }
}
