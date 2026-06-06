import java.util.Scanner;

public class basicmath2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ld = 0;
        int rev = 0;
        while (n>0){
            ld = n%10;
            rev = (rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
}
