 import java.util.Scanner;
//Print from n to 1
    public class recursion5 {
        static void f(int n,int i){
            if(i>n){
                return;
            }
            System.out.println(n);
            f(n-1,i);
        }
        static void main() {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            f(n,1);
        }
    }
