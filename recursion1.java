import java.util.Scanner;

public class recursion1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        f();
    }
    static void f() {
        System.out.println("1");
        f();
    }
}
