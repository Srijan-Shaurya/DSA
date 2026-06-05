import java.util.Scanner;

public class pattern7 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 5;
        for (int i = 0;i<n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for (int j = 0;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
