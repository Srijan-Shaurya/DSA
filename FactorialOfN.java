import java.util.Scanner;
//Print Factorial Of N Number
public class FactorialOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fact = 1f;
        System.out.print("Enter The Number: ");
        int n = input.nextInt();
        if (n==1||n==0){
            System.out.println("1");
        } else if (n<0) {
            System.out.println("Exception");
        }
        for(int i = 1;i<=n;i++){
            fact = i * fact;
        }
        System.out.println(fact);
    }
}
