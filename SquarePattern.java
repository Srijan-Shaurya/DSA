import java.util.Scanner;
//    Square Printing
public class SquarePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
//                    char ch = 'A';
        System.out.print("Enter The Number Of Lines: ");
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
