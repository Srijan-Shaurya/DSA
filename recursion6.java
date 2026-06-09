import java.util.Scanner;
//Print linearly from 1 to N but by backtracking
public class recursion6 {
    static void f(int i , int n){
        if (i<1){
            return;
        }
        f(i-1,n);
        System.out.println(i);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        f(n,n);
    }
}
