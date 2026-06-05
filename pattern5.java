import java.util.Scanner;

public class pattern5 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
