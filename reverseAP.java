// Display this AP 100,97,94,... upto all term which are positive

package loops;
public class reverseAP {
    public static void main(String[] args) {
        int a = 100;
        for (int i=1;a>0;i++){
            System.out.println(a);
            a = a - 3;
        }
    }
}
