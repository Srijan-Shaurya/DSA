import java.util.Scanner;
//print from n to 1 using backtracking
public class recursion7 {
    static void f(int i , int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        f(i-1,n);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        int l = input.nextInt();
        System.out.println("Sum of two Number is: "+ (n +l));
        f(n,n);
    }
}
