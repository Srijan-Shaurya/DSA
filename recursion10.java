import java.util.Scanner;
//we will find factorial with functional recursion
public class recursion10 {
    static int f(int n){
        if (n<=0){
            return 1;
        }
        return n*f(n-1);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(f(n));
    }
}
