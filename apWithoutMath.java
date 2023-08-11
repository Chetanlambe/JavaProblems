package loops;

import java.util.Scanner;
public class apWithoutMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a = a + 3;
        }

    }
}
