import java.util.Scanner;
//Print Name 5 times using recursion
public class recursion3 {
    public static void f(int i,int n){
        if (i>n){
            return;
        }
        System.out.println("Srijan");
        f(i+1,n);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        f(1,n);
    }
}
