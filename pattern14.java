import java.util.Scanner;

public class pattern14 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 5;
        for (int i = 1;i<=n;i++){
            char ch = 'A';
            for (int j= 1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
