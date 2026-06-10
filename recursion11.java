import java.util.Scanner;
//Finding factorial of n number using parameterized recursion i could not make this parameterised mummmyyyyyyyy
public class recursion11 {
    static int f(int n){
    if (n<=1){
        return 1;
    }
        return (n*f(n-1));
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        f(n);
    }
}
