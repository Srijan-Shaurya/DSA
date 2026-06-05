import java.util.Scanner;

public class pattern11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 5;
        int num = 1;
        for (int i = 0;i<n;i++){
            if (i%2==0){
                num = 1;
            }
            else {
                num = 0;
            }
            for (int j = 0;j<=i;j++){
                System.out.print(num);
                num = 1-num;
            }
            System.out.println();
        }
    }
}
