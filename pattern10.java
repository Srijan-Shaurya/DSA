import java.util.Scanner;

public class pattern10 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 5;
        for (int i = 1;i<=2*n-1;i++){
            int stars;
            if (i<=n){
                 stars = i;
            } else {
                stars = 2 *n-i;
            }
//                stars = 2 * n -1;
            for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
