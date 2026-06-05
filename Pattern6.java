import java.util.Scanner;

public class Pattern6 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0;i<n;i++){
            int num = 1;
            for (int j = n;j>i;j--){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
