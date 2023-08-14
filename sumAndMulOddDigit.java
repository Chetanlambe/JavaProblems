package loops;

import java.util.Scanner;
public class sumAndMulOddDigit {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int sum = 0;
//        int ls; // ls means -> lastDigit
//        while(n != 0){
//            ls = n%10;
//            if(ls % 2 != 0 ){
//                sum = sum + ls;
//            }
//            n = n/10;
//        }
//        System.out.println("sum of the Odd number in Digit is : "+ sum);

//         Bellow code is use for the multiplication
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ml = 1; // ml means -> multiplication
        int ls; // ls means -> lastDigit
        while(n != 0){
            ls = n%10;
            if(ls % 2 != 0 ){
                ml = ml * ls;
            }
            n = n/10;
        }
        System.out.println("Multiplication of the Odd number in Digit is : "+ ml);

    }
}
