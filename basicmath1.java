import java.util.Scanner;

public class basicmath1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int n = 78785;
        int i = 0;
        while (n>0){
//            num = n%10;
//            System.out.println(num);
            i++;
            n=n/10;

        }
        System.out.println(i);
    }
}
