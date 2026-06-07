import java.util.Scanner;

public class PrintDivisors {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
