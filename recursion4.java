import java.util.Scanner;
//print from 1 to n
public class recursion4 {
    static void f(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        f(n,i+1);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        f(n,1);
    }
}
