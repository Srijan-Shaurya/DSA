import java.util.Scanner;
//This is a type of functional recursion
// in functional recursion we use return statement that means we have to use integer types and all
public class recursion9 {
    static int f(int n){
        if(n==0){
            return 0;
        }
        return n+f(n-1);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(f(n));
    }
}
